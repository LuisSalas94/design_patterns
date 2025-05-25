package org.fernando.behavioral.iterator;

import java.util.List;

public class ConcreteCollection<T> implements Aggregate<T> {

    private List<T> collection;

    public ConcreteCollection(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(collection);
    }
}
