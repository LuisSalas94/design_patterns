package org.fernando.behavioral.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
