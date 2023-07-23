package com.monke.module;

import com.google.inject.Guice;
import com.google.inject.Injector;
import jakarta.inject.Inject;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;

@SuppressWarnings("CommentedOutCode")
@ApplicationPath("/")
public class Config extends ResourceConfig {

    @Inject
    public Config(ServiceLocator serviceLocator) {
        packages("com.monke.resource");

//        Bridge from HK2 to Guice can be done 2 ways
//        Either use the GuiceIntoHK2Bridge service
        register(new GuiceFeature());

//        or use a Factory that provides from Guice
//        Injector injector = Guice.createInjector(new GuiceModule());
//        register(new HK2toGuiceModule(injector));
    }
}