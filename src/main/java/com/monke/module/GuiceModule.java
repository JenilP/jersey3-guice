package com.monke.module;

import com.google.inject.AbstractModule;
import com.monke.service.BananaService;
import com.monke.service.FruitService;
import com.monke.service.impl.BananaServiceImpl;
import com.monke.service.impl.FruitServiceImpl;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FruitService.class).to(FruitServiceImpl.class);
        bind(BananaService.class).to(BananaServiceImpl.class);
    }
}