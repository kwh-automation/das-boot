package com.boot;

import com.boot.service.DiceRollService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        DiceRollService.diceRollSix();
        SpringApplication.run(App.class, args);
    }
}
