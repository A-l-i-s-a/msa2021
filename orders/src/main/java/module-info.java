module msa.orders {
    exports msa.orders;

    //compile dependencies
    requires spring.boot;
    requires spring.boot.autoconfigure;

    //spring runtime introspection dependencies
    requires spring.context;
    requires spring.core;
    requires spring.beans;

    requires jdk.unsupported;
    requires msa.clients;//for netty low-level API access
    requires java.persistence;
}