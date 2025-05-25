package org.fernando.behavioral.chainofresponsibility;

public class LogHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.equalsIgnoreCase("LOG")) {
            System.out.println("Logging request...");
        } else if (next != null) {
            next.handle(request);
        }
    }
}
