package org.fernando.creational.abstractfactory.demo1.concreteproducts;

import org.fernando.creational.abstractfactory.demo1.productinterfaces.Table;

public class RusticTable implements Table {
    @Override
    public void placeItems() {
        System.out.println("Placing items on a rustic table");
    }
}
