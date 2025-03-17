package org.fernando.creational.factory.demo3;

public class PizzaApp {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore osloStore = new OsloPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

        System.out.println("Linda ordered a " + pizza.getClass().getSimpleName());

        System.out.println();

        pizza = osloStore.orderPizza("veggie");
        System.out.println("Claudia ordered a " + pizza.getClass().getSimpleName());
    }
}
