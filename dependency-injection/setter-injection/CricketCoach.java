package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	// add new fields for email and team
	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method- setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method- setTeam");
		this.team = team;
	}

	// create a nor-arg constructor
	public CricketCoach() {
		System.out.println("Inside no-arg CricketCoach Class Constructor");
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside setter Method in CricketCoach Class ");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice fast bowling for 15min";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.geFortune();
	}

}
