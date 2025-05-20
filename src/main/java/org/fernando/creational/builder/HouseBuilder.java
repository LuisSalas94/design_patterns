package org.fernando.creational.builder;

public interface HouseBuilder {
    void buildFoundation();

    void buildWalls();

    void buildRoof();

    void buildRooms();

    void buildWindows();

    House getResult();
}
