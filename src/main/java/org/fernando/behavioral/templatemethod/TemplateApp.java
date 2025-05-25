package org.fernando.behavioral.templatemethod;

public class TemplateApp {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process();

        DataProcessor dbProcessor = new DatabaseDataProcessor();
        dbProcessor.process();
    }
}
