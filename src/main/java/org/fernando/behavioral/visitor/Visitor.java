package org.fernando.behavioral.visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
