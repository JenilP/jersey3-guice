package com.monke.module;

import com.google.inject.Injector;
import com.monke.service.FruitService;
import org.glassfish.hk2.api.Factory;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class HK2toGuiceModule extends AbstractBinder {

    private final Injector guiceInjector;

    public HK2toGuiceModule(Injector guiceInjector) {
        this.guiceInjector = guiceInjector;
    }

    @Override
    protected void configure() {
        bindFactory(new ServiceFactory<>(guiceInjector, FruitService.class)).to(FruitService.class);
    }

    private record ServiceFactory<T>(Injector guiceInjector,
                                     Class<T> serviceClass) implements Factory<T> {
        @Override
        public T provide() {
            return guiceInjector.getInstance(serviceClass);
        }
        @Override
        public void dispose(T versionResource) {
        }
    }
}