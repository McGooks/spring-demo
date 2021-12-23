package com.luv2code.springdemo;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 500 lengths a day";
    }
}
