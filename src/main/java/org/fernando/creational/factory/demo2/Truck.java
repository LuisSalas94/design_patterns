package org.fernando.creational.factory.demo2;

// Concrete Products
public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }
}
