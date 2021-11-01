package msa.pictures;

import javax.persistence.*;
import java.util.UUID;

public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private UUID orderId;
    private UUID packageId;
    private String uri;
    private Long size;

    public Image(String name, UUID orderId, UUID packageId, String uri, Long size) {
        this.name = name;
        this.orderId = orderId;
        this.packageId = packageId;
        this.uri = uri;
        this.size = size;
    }
}
