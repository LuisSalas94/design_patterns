package org.fernando.behavioral.strategy;

public class DrivingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating driving route from " + startPoint + " to " + endPoint);
    }
}
