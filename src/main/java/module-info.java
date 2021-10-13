module msa {
    opens com.example.msa2021;

    //compile dependencies
    requires spring.boot;
    requires spring.boot.autoconfigure;

    //spring runtime introspection dependencies
    requires spring.context;
    requires spring.core;
    requires spring.beans;

    requires jdk.unsupported;//for netty low-level API access
}