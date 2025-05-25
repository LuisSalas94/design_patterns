package org.fernando.behavioral.mediator;

public class TextBox extends Component {
    private String text;

    public TextBox(Mediator mediator) {
        super(mediator);
    }

    public void inputText(String text) {
        this.text = text;
        System.out.println("TextBox input: " + text);
        mediator.notify(this, "textChanged");
    }

    public String getText() {
        return text;
    }

}
