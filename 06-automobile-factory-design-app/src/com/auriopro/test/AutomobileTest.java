package com.auriopro.test;

import com.auriopro.model.AutoMobileFactory;
import com.auriopro.model.Autotype;
import com.auriopro.model.IAutomobile;

public class AutomobileTest {
	public static void main(String[] args) {
		
		AutoMobileFactory car = new AutoMobileFactory();
		
		IAutomobile bmw = car.makeAutomobile(Autotype.BMW);
		functionalities(bmw);
		
		IAutomobile maruti = car.makeAutomobile(Autotype.MARUTI);
		functionalities(maruti);
		
		IAutomobile tesla = car.makeAutomobile(Autotype.BMW);
		functionalities(tesla);
	}
	
	public static void functionalities(IAutomobile car) {
		System.out.println("----- Car Functionalities are ---------");
		car.start();
		car.stop();
		System.out.println();
	}
}
