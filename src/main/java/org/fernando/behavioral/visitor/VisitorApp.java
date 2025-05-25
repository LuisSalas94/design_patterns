package org.fernando.behavioral.visitor;

import java.util.List;

public class VisitorApp {
    public static void main(String[] args) {
        List<Element> items = List.of(
                new Book("Design Patterns", 60),
                new Fruit("Apple", 1.5, 2),
                new Book("Refactoring", 45)
        );

        Visitor cartVisitor = new ShoppingCartVisitor();
        for (Element item : items) {
            item.accept(cartVisitor);
        }
    }
}
