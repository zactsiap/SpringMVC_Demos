package com.tsiaparas.springdemo;

public class CricketCoach implements Coach {


  private FortuneService fortuneService;
  private String emailAddress;
  private String team;

  public CricketCoach() {
    System.out.println("CricketCoach: inside no-arg constructor");
  }

  public FortuneService getFortuneService() {
    return fortuneService;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("CricketCoach: inside setter method - setFortuneService");
    this.fortuneService = fortuneService;
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes";
  }

  @Override
  public String getFortune() {
    return fortuneService.getFortune();
  }
}
