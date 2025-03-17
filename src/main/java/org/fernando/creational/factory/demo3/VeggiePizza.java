package org.fernando.creational.factory.demo3;

public class VeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting veggie Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing veggie Pizza");
    }
}
