package org.fernando.creational.builder;

public class ConcreteHouseBuilder implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete");
    }

    @Override
    public void buildWalls() {
        house.setWalls("Brick");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Slate");
    }

    @Override
    public void buildRooms() {
        house.setRooms(5);
    }

    @Override
    public void buildWindows() {
        house.setWindows(10);
    }

    @Override
    public House getResult() {
        return house;
    }
}
