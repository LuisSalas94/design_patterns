package org.fernando.creational.abstractfactory.demo1.factoryinterface;

import org.fernando.creational.abstractfactory.demo1.productinterfaces.Chair;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Sofa;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
