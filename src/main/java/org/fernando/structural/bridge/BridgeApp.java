package org.fernando.structural.bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Renderer raster = new RasterRenderer();
        Renderer vector = new VectorRenderer();
        Shape circle1 = new Circle(raster, 5);
        Shape circle2 = new Circle(vector, 10);
        circle1.draw();
        circle2.draw();
    }
}
