package org.fernando.structural.composite;

public class CompositeApp {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("resume.pdf");
        FileSystemComponent file2 = new File("cover_letter.docx");

        Directory home = new Directory("Home");
        Directory documents = new Directory("Documents");

        documents.add(file1);
        documents.add(file2);

        FileSystemComponent music = new File("Sliver.mp3");
        Directory downloads = new Directory("Downloads");
        downloads.add(music);

        home.add(documents);
        home.add(downloads);

        home.display(" ");

    }
}
