package com.auriopro.model;

public class AutoMobileFactory {

	public IAutomobile makeAutomobile(Autotype car) {
		
		if(car==Autotype.BMW)
			return new Bmw();
		if(car==Autotype.MARUTI)
			return new Maruti();
		
		return new Tesla();
	}
}
