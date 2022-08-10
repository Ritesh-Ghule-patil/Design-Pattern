package com.auriopro.model;

public class Bmw implements IAutomobile {

	@Override
	public void start() {
		System.out.println("BMW Start");
	}

	@Override
	public void stop() {
		System.out.println("BMW stop");
	}

}
