package org.fernando.behavioral.chainofresponsibility;

public class ErrorHandler extends Handler {

    @Override
    public void handle(String request) {
        if (request.equalsIgnoreCase("ERROR")) {
            System.out.println("Handling error...");
        } else if (next != null) {
            next.handle(request);
        } else {
            System.out.println("No handle found for request: " + request);
        }
    }
}
