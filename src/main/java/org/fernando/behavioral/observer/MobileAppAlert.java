package org.fernando.behavioral.observer;

public class MobileAppAlert implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Mobile App: " + stockSymbol + " updated to $" + price);
    }
}
