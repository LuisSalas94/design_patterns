package org.fernando.creational.factory.demo2;

// Client Code
public class LogisticsApp {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

    }
}
