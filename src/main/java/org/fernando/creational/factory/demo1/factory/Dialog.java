package org.fernando.creational.factory.demo1.factory;

import org.fernando.creational.factory.demo1.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
