package org.fernando.behavioral.strategy;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating walking route from " + startPoint + " to " + endPoint);
    }
}
