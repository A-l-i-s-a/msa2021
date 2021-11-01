module msa.orders {
    exports msa.orders;

    //compile dependencies
    requires spring.boot;
    requires spring.boot.autoconfigure;

    //spring runtime introspection dependencies
    requires spring.context;
    requires spring.cloud.gcp.data.datastore;
    requires spring.web;
    requires spring.data.commons;
    requires spring.beans;
    requires google.cloud.core;

    requires jdk.unsupported;
    requires java.persistence;
}