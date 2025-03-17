package org.fernando.creational.factory.demo1;

import org.fernando.creational.factory.demo1.factory.Dialog;
import org.fernando.creational.factory.demo1.factory.HtmlDialog;
import org.fernando.creational.factory.demo1.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    public static void runBusinessLogic() {
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        configure();
        runBusinessLogic();

    }
}
