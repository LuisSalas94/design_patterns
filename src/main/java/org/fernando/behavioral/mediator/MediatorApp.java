package org.fernando.behavioral.mediator;

public class MediatorApp {
    public static void main(String[] args) {
        DialogMediator mediator = new DialogMediator();
        TextBox textBox = new TextBox(mediator);
        Button button = new Button(mediator);

        mediator.setTextBox(textBox);
        mediator.setButton(button);

        textBox.inputText("Hello World");
        button.click();
    }
}
