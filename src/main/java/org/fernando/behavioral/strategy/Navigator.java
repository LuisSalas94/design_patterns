package org.fernando.behavioral.strategy;

public class Navigator {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String from, String to) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy must be set before building route.");
        }
        strategy.buildRoute(from, to);
    }
}
