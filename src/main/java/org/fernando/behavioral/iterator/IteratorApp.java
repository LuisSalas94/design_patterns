package org.fernando.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorApp {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");

        ConcreteCollection<String> collection = new ConcreteCollection<>(items);
        Iterator<String> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.nex());
        }
    }
}
