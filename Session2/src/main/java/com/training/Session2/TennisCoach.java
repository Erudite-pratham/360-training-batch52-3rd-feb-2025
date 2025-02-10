package com.training.Session2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    // setter based dependency injection
    private SportsKit sportsKit;

    @Autowired
    public void setSportsKit(SportsKit sportsKit) {
        this.sportsKit = sportsKit;
    }

    @Override
    public String getWorkout() {
        return "Workout from tennis coach";
    }

    @Override
    public String getMyKit() {
        return sportsKit.getMyKit();
    }
}
