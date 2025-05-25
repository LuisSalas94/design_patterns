package org.fernando.behavioral.chainofresponsibility;

public class ChainApp {
    public static void main(String[] args) {
        Handler auth = new AuthHandler();
        Handler log = new LogHandler();
        Handler error = new ErrorHandler();

        auth.setNext(log).setNext(error);

        auth.handle("AUTH");
        auth.handle("LOG");
        auth.handle("ERROR");
        auth.handle("UNKNOWN");
    }
}
