package com.aurionpro.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SingltonDemo implements Serializable {
	
	public static SingltonDemo instance = new SingltonDemo();

	private SingltonDemo() {

	}
	
	protected Object readResolve()
    {
        return instance;
    }
	
//	public synchronized static SingltonDemo createInstance() {
//		if (instance == null) {
//			instance = new SingltonDemo();
//		}
//		return instance;
//	}
}
