package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    public String[] arr = {"Today is your lucky day!", "You are lucky!", "Today is your day!"};

    public static String getRandom(String[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }

    @Override
    public String getFortune() {
        return getRandom(arr);
    }
}
