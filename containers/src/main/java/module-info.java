module msa.containers {
    exports msa.containers;

    //compile dependencies
    requires spring.boot;
    requires spring.boot.autoconfigure;

    //spring runtime introspection dependencies
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.data.commons;
    requires spring.data.jpa;

    requires jdk.unsupported;
    requires java.persistence;//for netty low-level API access
}