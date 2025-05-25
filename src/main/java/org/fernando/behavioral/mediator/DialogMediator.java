package org.fernando.behavioral.mediator;

public class DialogMediator implements Mediator {

    private Button button;
    private TextBox textBox;

    public void setButton(Button button) {
        this.button = button;
    }

    public void setTextBox(TextBox textBox) {
        this.textBox = textBox;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender instanceof TextBox && event.equals("textChanged")) {
            if (!textBox.getText().isEmpty()) {
                System.out.println("Mediator: Enabling the button");
            } else {
                System.out.println("Mediator: Disabling the button");
            }
        } else if (sender instanceof Button && event.equals("click")) {
            System.out.println("Mediator: Button was clicked, processing...");
        }
    }
}
