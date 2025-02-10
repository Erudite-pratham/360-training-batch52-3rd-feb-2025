package com.training.Session2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach{

    // constructor based dependency injection
    private SportsKit sportsKit;

    public CricketCoach(@Autowired SportsKit sportsKit) {
        this.sportsKit = sportsKit;
    }

    @Override
    public String getWorkout() {
        return "Workout from cricket coach";
    }

    @Override
    public String getMyKit() {
        return sportsKit.getMyKit();
    }
}
