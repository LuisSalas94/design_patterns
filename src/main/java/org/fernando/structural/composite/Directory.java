package org.fernando.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {

    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemComponent component : children) {
            component.display(indent + " ");
        }
    }
}
