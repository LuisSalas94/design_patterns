package org.fernando.behavioral.strategy;

public class CyclingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String startPoint, String endPoint) {
        System.out.println("Calculating cycling route from " + startPoint + " to " + endPoint);
    }
}
