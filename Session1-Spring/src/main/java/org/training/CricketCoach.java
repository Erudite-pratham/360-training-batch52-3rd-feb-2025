package org.training;

public class CricketCoach implements Coach{

    SportsKit sportsKit;

    public CricketCoach(SportsKit sportsKit){
        this.sportsKit = sportsKit;
    }

    @Override
    public String sayHello() {
        return "Hello from cricket coach";
    }

    @Override
    public String getSportsKit() {
        return sportsKit.kitGranted();
    }
}
