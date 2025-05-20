package org.fernando.creational.abstractfactory.demo1.concretefactories;

import org.fernando.creational.abstractfactory.demo1.concreteproducts.RusticChair;
import org.fernando.creational.abstractfactory.demo1.concreteproducts.RusticSofa;
import org.fernando.creational.abstractfactory.demo1.concreteproducts.RusticTable;
import org.fernando.creational.abstractfactory.demo1.factoryinterface.FurnitureFactory;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Chair;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Sofa;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Table;

public class RusticFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new RusticChair();
    }

    @Override
    public Table createTable() {
        return new RusticTable();
    }

    @Override
    public Sofa createSofa() {
        return new RusticSofa();
    }
}
