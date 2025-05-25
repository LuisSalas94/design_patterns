package org.fernando.behavioral.observer;

public class ObserverApp {
    public static void main(String[] args) {
        Stock googleStock = new Stock("GOOG", 1500.00);
        Observer emailAlert = new EmailAlert();
        Observer mobileAlert = new MobileAppAlert();

        googleStock.attach(emailAlert);
        googleStock.attach(mobileAlert);

        googleStock.setPrice(1510.00);
        googleStock.setPrice(1525.00);
    }
}
