package org.fernando.behavioral.strategy;

public class StrategyApp {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setStrategy(new DrivingStrategy());
        navigator.buildRoute("Downtown", "Airport");

        navigator.setStrategy(new WalkingStrategy());
        navigator.buildRoute("Hotel", "Museum");

        navigator.setStrategy(new CyclingStrategy());
        navigator.buildRoute("Park", "Library");
    }
}
