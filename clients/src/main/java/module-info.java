module msa.clients {
    exports msa.clients;

    //compile dependencies
    requires spring.boot;
    requires spring.boot.autoconfigure;

    //spring runtime introspection dependencies
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.web;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.tx;

    requires jdk.unsupported;
    requires java.persistence;//for netty low-level API access
}