package com.monke.service.impl;

import com.google.inject.Inject;
import com.monke.service.BananaService;
import com.monke.service.FruitService;

public class FruitServiceImpl implements FruitService {

	@Inject
	BananaService bananaService;

	@Override
	public String getBanana() {
		return bananaService.getName();
	}
}