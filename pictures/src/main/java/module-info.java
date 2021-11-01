module msa.pictures {
    exports msa.pictures;

    requires org.slf4j;
    requires spring.boot.autoconfigure;

    //spring runtime introspection dependencies
    requires spring.context;
    requires spring.core;
    requires spring.beans;
//    requires spring.cloud.gcp.data.datastore;
    requires google.cloud.storage;
    requires google.cloud.core;
    requires spring.boot.starter.webflux;
    requires reactor.core;
    requires java.persistence;
}