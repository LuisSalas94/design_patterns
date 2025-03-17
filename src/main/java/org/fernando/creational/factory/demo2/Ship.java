package org.fernando.creational.factory.demo2;

// Concrete Products
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }
}
