package com.aurionpro.model;

public class OperatingSystemFactory {
	
	public OperatingSystem loadOs(String os) {
		
		if(os.equalsIgnoreCase("Secure")) 
			return new IOS();
		
		else if(os.equalsIgnoreCase("open source"))
		 return new Android();
		
		return new Windows();
	}

}
