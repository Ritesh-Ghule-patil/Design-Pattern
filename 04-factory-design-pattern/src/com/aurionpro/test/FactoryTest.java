package com.aurionpro.test;

import com.aurionpro.model.OperatingSystem;
import com.aurionpro.model.OperatingSystemFactory;
import com.aurionpro.model.Windows;

public class FactoryTest {
	
	public static void main(String[] args) {

		OperatingSystemFactory os = new OperatingSystemFactory();
		
		
		getOs(os.loadOs("Secure"));
		
		getOs(os.loadOs("Open source"));
		
//		OperatingSystem mobile1 = os.loadOs("Open Source");
//		mobile1.getOs();
//		
		
	}

	public static void getOs(OperatingSystem os) {
		os.getSpecs();
		System.out.println();
	}
}
