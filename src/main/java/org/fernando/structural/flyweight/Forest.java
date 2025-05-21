package org.fernando.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<TreeInstance> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        trees.add(new TreeInstance(x, y, type));
    }

    public void draw() {
        for (TreeInstance tree : trees) {
            tree.draw();
        }
    }

    private static class TreeInstance {
        private final int x;
        private final int y;
        private final TreeType type;

        public TreeInstance(int x, int y, TreeType type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }

        public void draw() {
            type.draw(x, y);
        }
    }
}
