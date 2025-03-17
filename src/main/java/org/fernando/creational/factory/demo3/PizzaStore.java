package org.fernando.creational.factory.demo3;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String typeOfPizza);

    public final Pizza orderPizza(String typeOfPizza) {
        Pizza pizza = createPizza(typeOfPizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
