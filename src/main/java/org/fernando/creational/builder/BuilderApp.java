package org.fernando.creational.builder;

public class BuilderApp {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new ConcreteHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        House house = houseDirector.constructHouse();
        System.out.println(house);
    }
}
