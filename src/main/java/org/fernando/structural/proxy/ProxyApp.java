package org.fernando.structural.proxy;

public class ProxyApp {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("landscape.jpg");
        System.out.println("Image will not load until display() is called...");
        image1.display(); // Loads and displays
        System.out.println("Second call to display() won't reload image:");
        image1.display(); // Displays only
    }
}
