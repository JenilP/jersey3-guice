Start app with
```shell
mvn clean package jetty:run
```

Dependency tree
```shell
[INFO] --- maven-dependency-plugin:2.8:tree (default-cli) @ jersey3-guice ---
[INFO] com.monke:jersey3-guice:war:1.0-SNAPSHOT
[INFO] +- org.glassfish.jersey.containers:jersey-container-servlet:jar:3.1.2:compile
[INFO] |  +- org.glassfish.jersey.containers:jersey-container-servlet-core:jar:3.1.2:compile
[INFO] |  +- org.glassfish.jersey.core:jersey-common:jar:3.1.2:compile
[INFO] |  |  +- jakarta.annotation:jakarta.annotation-api:jar:2.1.1:compile
[INFO] |  |  \- org.glassfish.hk2:osgi-resource-locator:jar:1.0.3:compile
[INFO] |  +- org.glassfish.jersey.core:jersey-server:jar:3.1.2:compile
[INFO] |  |  +- org.glassfish.jersey.core:jersey-client:jar:3.1.2:compile
[INFO] |  |  \- jakarta.validation:jakarta.validation-api:jar:3.0.2:compile
[INFO] |  \- jakarta.ws.rs:jakarta.ws.rs-api:jar:3.1.0:compile
[INFO] +- org.glassfish.jersey.inject:jersey-hk2:jar:3.1.2:compile
[INFO] |  +- org.glassfish.hk2:hk2-locator:jar:3.0.4:compile
[INFO] |  |  +- org.glassfish.hk2.external:aopalliance-repackaged:jar:3.0.4:compile
[INFO] |  |  \- org.glassfish.hk2:hk2-utils:jar:3.0.4:compile
[INFO] |  \- org.javassist:javassist:jar:3.29.0-GA:compile
[INFO] +- org.glassfish.hk2:guice-bridge:jar:3.0.4:compile
[INFO] |  +- jakarta.inject:jakarta.inject-api:jar:2.0.1:compile
[INFO] |  \- org.glassfish.hk2:hk2-api:jar:3.0.4:compile
[INFO] \- com.google.inject:guice:jar:7.0.0:compile
[INFO]    +- aopalliance:aopalliance:jar:1.0:compile
[INFO]    \- com.google.guava:guava:jar:31.0.1-jre:compile
[INFO]       +- com.google.guava:failureaccess:jar:1.0.1:compile
[INFO]       +- com.google.guava:listenablefuture:jar:9999.0-empty-to-avoid-conflict-with-guava:compile
[INFO]       +- com.google.code.findbugs:jsr305:jar:3.0.2:compile
[INFO]       +- org.checkerframework:checker-qual:jar:3.12.0:compile
[INFO]       +- com.google.errorprone:error_prone_annotations:jar:2.7.1:compile
[INFO]       \- com.google.j2objc:j2objc-annotations:jar:1.3:compile
```