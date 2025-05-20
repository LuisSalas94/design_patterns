package org.fernando.creational.abstractfactory.demo1.concretefactories;

import org.fernando.creational.abstractfactory.demo1.concreteproducts.ModernChair;
import org.fernando.creational.abstractfactory.demo1.concreteproducts.ModernSofa;
import org.fernando.creational.abstractfactory.demo1.concreteproducts.ModernTable;
import org.fernando.creational.abstractfactory.demo1.factoryinterface.FurnitureFactory;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Chair;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Sofa;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
