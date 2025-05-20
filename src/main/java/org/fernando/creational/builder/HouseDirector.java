package org.fernando.creational.builder;

public class HouseDirector {
    private final HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
        return houseBuilder.getResult();
    }
}
