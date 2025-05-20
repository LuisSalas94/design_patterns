package org.fernando.creational.abstractfactory.demo1.concreteproducts;

import org.fernando.creational.abstractfactory.demo1.productinterfaces.Chair;

public class VictorianChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
    }
}
