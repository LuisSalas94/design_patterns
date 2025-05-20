package org.fernando.creational.abstractfactory.demo1.concretefactories;

import org.fernando.creational.abstractfactory.demo1.concreteproducts.VictorianChair;
import org.fernando.creational.abstractfactory.demo1.concreteproducts.VictorianSofa;
import org.fernando.creational.abstractfactory.demo1.concreteproducts.VictorianTable;
import org.fernando.creational.abstractfactory.demo1.factoryinterface.FurnitureFactory;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Chair;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Sofa;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
