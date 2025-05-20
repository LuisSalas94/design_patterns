package org.fernando.creational.abstractfactory.demo1;

import org.fernando.creational.abstractfactory.demo1.concretefactories.ModernFurnitureFactory;
import org.fernando.creational.abstractfactory.demo1.concretefactories.RusticFurnitureFactory;
import org.fernando.creational.abstractfactory.demo1.concretefactories.VictorianFurnitureFactory;
import org.fernando.creational.abstractfactory.demo1.factoryinterface.FurnitureFactory;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Chair;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Sofa;
import org.fernando.creational.abstractfactory.demo1.productinterfaces.Table;

public class FurnitureApp {
    public static void main(String[] args) {
        // Creating modern furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        Sofa modernSofa = modernFactory.createSofa();

        modernChair.sitOn();
        modernTable.placeItems();
        modernSofa.sitOn();

        // Creating Victorian furniture
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();
        Sofa victorianSofa = victorianFactory.createSofa();

        victorianChair.sitOn();
        victorianTable.placeItems();
        victorianSofa.sitOn();

        // Creating rustic furniture
        FurnitureFactory rusticFactory = new RusticFurnitureFactory();
        Chair rusticChair = rusticFactory.createChair();
        Table rusticTable = rusticFactory.createTable();
        Sofa rusticSofa = rusticFactory.createSofa();

        rusticChair.sitOn();
        rusticTable.placeItems();
        rusticSofa.sitOn();
    }
}
