package org.fernando.behavioral.templatemethod;

public abstract class DataProcessor {
    // Template method (defines the skeleton)
    public final void process() {
        readData();
        processData();
        writeData();
    }

    // Abstract steps to be implemented by subclasses
    protected abstract void readData();
    protected abstract void processData();

    // Optional concrete method
    protected void writeData() {
        System.out.println("Writing data to output...");
    }
}
