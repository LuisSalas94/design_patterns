package org.fernando.behavioral.memento;

public class MementoApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello");
        history.save(editor);

        editor.type(" World!");
        history.save(editor);

        System.out.println("Current Content: " + editor.getContent());

        history.undo(editor);
        System.out.println("After Undo: " + editor.getContent());

        history.undo(editor);
        System.out.println("After Second Undo: " + editor.getContent());
    }
}
