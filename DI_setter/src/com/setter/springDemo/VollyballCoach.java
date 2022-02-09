package com.setter.springDemo;

public class VollyballCoach implements Coach {

	private Fortune fortune;
	
	public VollyballCoach() {
		System.out.println("vollyball Coach:");
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDaily() {
		// TODO Auto-generated method stub
		return "Set a ball for shmasher>>>";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.happyFortune();
	}

}
