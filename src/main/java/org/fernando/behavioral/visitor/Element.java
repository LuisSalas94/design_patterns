package org.fernando.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
