package org.fernando.creational.factory.demo3;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String typeOfPizza) {
        return switch (typeOfPizza) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
