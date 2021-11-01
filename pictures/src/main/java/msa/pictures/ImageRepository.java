package msa.pictures;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Repository
public class ImageRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(ImageRepository.class);
    private static final String BUCKET_NAME = "trainings-5dol";

    private final Storage storage;
    private final String namespace;

    public ImageRepository(Storage storage, @Value("${spring.cloud.gcp.datastore.namespace}") String namespace) {
        this.storage = storage;
        this.namespace = namespace;
    }

    public Mono<? extends Image> createImage(UUID orderId, UUID packageId, String name, Flux<DataBuffer> content) {
        var blobInfo = BlobInfo.newBuilder(BUCKET_NAME, namespace + "/" + orderId + "/" + packageId + "/" + name)
                .setMetadata(Map.of("orderId", orderId.toString(), "packageId", packageId.toString())).build();
        return Mono.using(
                () -> storage.writer(blobInfo),
                (writer) -> content.reduce(0L, (totalBytes, buffer) -> {
                    try {
                        return totalBytes + writer.write(buffer.asByteBuffer());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }),
                (writer) -> {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        ).map((totalBytes) -> new Image(name, orderId, packageId, blobInfo.getBlobId().toGsUtilUri(), totalBytes));
    }
}
