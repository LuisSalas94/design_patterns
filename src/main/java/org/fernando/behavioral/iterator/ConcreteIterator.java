package org.fernando.behavioral.iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> collection;
    private int index;

    public ConcreteIterator(List<T> collection) {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }

    @Override
    public T nex() {
        return collection.get(index++);
    }
}
