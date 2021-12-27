package com.luv2code.springdemo;

public class SwimCoach implements Coach {
    private final FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 500 lengths a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add in init method
    public void doMyStartUpStuff() {
        System.out.println("TrackCoach: inside method doMyStartUpStuff");
    }

    //add a destroy method
    public void doMyCleanUpStuff() {
        System.out.println("TrackCoach: inside method doMyCleanUpStuff");
    }
}
