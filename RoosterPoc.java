package com.solution;

public class RoosterPoc extends Bird{
	String voice;
	
	public RoosterPoc(String voice){
		this.voice = voice;
	}
	
	@Override
	void sing() {
		System.out.println("Rooster sings " + voice);
	}
	
}
