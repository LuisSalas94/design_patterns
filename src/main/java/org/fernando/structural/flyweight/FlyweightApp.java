package org.fernando.structural.flyweight;

public class FlyweightApp {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(15, 25, "Oak", "Green", "Rough");
        forest.plantTree(20, 30, "Pine", "Dark Green", "Smooth");

        forest.draw();
    }
}
