package org.fernando.creational.singleton;

public class Singleton {
    private static Singleton instance;

    public Singleton() {
        // Prevent instantiation from other classes
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}
