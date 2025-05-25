package org.fernando.behavioral.chainofresponsibility;

public class AuthHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.equalsIgnoreCase("AUTH")) {
            System.out.println("Authenticating user...");
        } else if (next != null) {
            next.handle(request);
        }
    }
}
