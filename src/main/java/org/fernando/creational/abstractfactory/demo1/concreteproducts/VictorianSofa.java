package org.fernando.creational.abstractfactory.demo1.concreteproducts;

import org.fernando.creational.abstractfactory.demo1.productinterfaces.Sofa;

public class VictorianSofa implements Sofa {

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian sofa");
    }
}
