package com.auriopro.model;

public class Tesla implements IAutomobile {

	@Override
	public void start() {
		System.out.println("TESLA Start");
	}

	@Override
	public void stop() {
		System.out.println("TESLA stop");
	}

}
