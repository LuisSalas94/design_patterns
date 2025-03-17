package org.fernando.creational.factory.demo1.factory;

import org.fernando.creational.factory.demo1.buttons.Button;
import org.fernando.creational.factory.demo1.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
