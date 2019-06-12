package com.tsiaparas.springdemo;

public class BaseballCoach implements Coach {

  private FortuneService fortuneService;

  public BaseballCoach(FortuneService theFortuneService) {
    this.fortuneService = theFortuneService;
  }

  @Override
  public String getFortune() {
    return fortuneService.getFortune();
  }

  @Override
  public String getDailyWorkout() {
    return "Spend 30 min on code practice";
  }


}

