package com.boot.service;

import java.util.Random;

public class DiceRollService {

    public static Integer diceRollSix() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6) + 1;
        System.out.println("Random number generated is : " + randomInt);
        return randomInt;
    }
}
