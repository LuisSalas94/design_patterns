package org.fernando.behavioral.templatemethod;

public class DatabaseDataProcessor extends DataProcessor{
    @Override
    protected void readData() {
        System.out.println("Reading data from Database...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing Database data...");
    }
}
