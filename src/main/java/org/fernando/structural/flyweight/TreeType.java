package org.fernando.structural.flyweight;

public class TreeType implements Tree {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing tree of type [" + name + "] at (" + x + ", " + y + ")");
    }
}
