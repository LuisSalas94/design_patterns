package org.fernando.creational.factory.demo3;

public class PepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing pepperoni Pizza");
    }
}
