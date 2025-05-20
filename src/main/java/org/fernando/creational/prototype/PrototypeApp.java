package org.fernando.creational.prototype;

import java.util.Date;

public class PrototypeApp {
    public static void main(String[] args) {
        Document originalDocument = new Document("Original Text", new Date());
        System.out.println("Original Document: " + originalDocument);

        Document clonedDocument = (Document) originalDocument.clone();
        clonedDocument.setText("Cloned Text");
        System.out.println("Cloned Document: " + clonedDocument);
    }
}
