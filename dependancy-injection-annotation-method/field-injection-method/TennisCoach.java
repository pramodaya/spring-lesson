package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifire("happyFortuneService");
	private FortuneService fortuneService;
	
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
	

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
