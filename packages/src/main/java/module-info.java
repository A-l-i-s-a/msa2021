module msa.packages {
    exports msa.packages;

    //compile dependencies
    requires spring.boot;
    requires spring.boot.autoconfigure;

    //spring runtime introspection dependencies
    requires spring.context;
    requires spring.core;
    requires spring.beans;
//    requires spring.cloud.gcp.data.datastore;

    requires jdk.unsupported;
    requires java.persistence;
}