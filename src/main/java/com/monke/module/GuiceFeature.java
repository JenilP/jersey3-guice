package com.monke.module;

import com.google.inject.Guice;
import com.google.inject.Injector;
import jakarta.annotation.Priority;
import jakarta.ws.rs.core.Feature;
import jakarta.ws.rs.core.FeatureContext;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.InjectionManagerProvider;
import org.glassfish.jersey.internal.inject.InjectionManager;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

@Priority(1)
public class GuiceFeature implements Feature {
    @Override
    public boolean configure(FeatureContext featureContext) {
        InjectionManager injectionManager = InjectionManagerProvider.getInjectionManager(featureContext);
        ServiceLocator serviceLocator = injectionManager.getInstance(ServiceLocator.class);
        Injector injector = Guice.createInjector(new GuiceModule());
        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
        GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        guiceBridge.bridgeGuiceInjector(injector);
        return true;
    }
}
