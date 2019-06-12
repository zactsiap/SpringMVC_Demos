package com.tsiaparas.springdemo;

public class TrackCoach implements Coach {

  private FortuneService fortuneService;

  public TrackCoach() {
  }

  public TrackCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Spend 45 min in code practice now !";
  }

  @Override
  public String getFortune() {
    return "Just do it: " + fortuneService.getFortune();
  }
}
