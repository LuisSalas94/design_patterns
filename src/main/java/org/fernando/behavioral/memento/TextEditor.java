package org.fernando.behavioral.memento;

public class TextEditor {
    private String content = "";

    public void type(String newText) {
        content += newText;
    }

    public String getContent() {
        return content;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(content);
    }

    public void restore(TextEditorMemento memento) {
        this.content = memento.getContent();
    }
}
