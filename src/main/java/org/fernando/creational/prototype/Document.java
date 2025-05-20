package org.fernando.creational.prototype;

import java.util.Date;

public class Document implements Prototype {
    private String text;
    private final Date creationDate;

    public Document(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }

    @Override
    public Prototype clone() {
        return new Document(this.text, this.creationDate);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreationDate() {
        return creationDate;
    }


    @Override
    public String toString() {
        return "Document{" +
                "text='" + text + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
