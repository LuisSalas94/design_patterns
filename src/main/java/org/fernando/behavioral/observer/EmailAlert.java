package org.fernando.behavioral.observer;

public class EmailAlert implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Email Alert: " + stockSymbol + " is now $" + price);
    }
}
