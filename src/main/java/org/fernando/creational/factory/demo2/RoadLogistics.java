package org.fernando.creational.factory.demo2;

// Concrete Creators
public class RoadLogistics extends Logistics {

    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
