package com.setter.springDemo;

public class CricketCoach implements Coach {

	private Fortune fortune;
	
	private String email,team;
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("in setter email method");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("in setter team method");
	}

	public CricketCoach() {
		System.out.println("inside contructor");
	}
	
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
		System.out.println("inside setter method");
	}

	@Override
	public String getDaily() {
		
		return "hit a four on a length a ball..";
	}

	@Override
	public String getDailyFortune() {
	
		return fortune.happyFortune() ;
	}

}
