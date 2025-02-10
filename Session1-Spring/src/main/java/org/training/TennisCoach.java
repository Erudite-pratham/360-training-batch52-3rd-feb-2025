package org.training;

public class TennisCoach implements Coach{



    private SportsKit sportsKit;

    public void setSportsKit(SportsKit sportsKit) {
        this.sportsKit = sportsKit;
    }

    @Override
    public String sayHello() {
        return "Hello from tennis coach";
    }

    @Override
    public String getSportsKit() {
        return sportsKit.kitGranted();
    }
}
