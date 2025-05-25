package org.fernando.behavioral.visitor;

public class ShoppingCartVisitor implements Visitor{
    @Override
    public void visit(Book book) {
        double cost = book.getPrice();
        if (cost > 50) {
            cost -= 5; // discount
        }
        System.out.println("Book: " + book.getTitle() + " costs $" + cost);
    }

    @Override
    public void visit(Fruit fruit) {
        double cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit: " + fruit.getName() + " costs $" + cost);
    }
}
