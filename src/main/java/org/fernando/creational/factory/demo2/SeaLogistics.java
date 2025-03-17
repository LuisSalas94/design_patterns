package org.fernando.creational.factory.demo2;
// Concrete Creators
public class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
