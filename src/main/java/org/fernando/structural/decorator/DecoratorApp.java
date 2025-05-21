package org.fernando.structural.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        Notifier basicNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifier(basicNotifier);
        Notifier slackAndSMSNotifier = new SlackNotifier(smsNotifier);

        System.out.println("=== Basic Email ===");
        basicNotifier.send("System going down for maintenance");

        System.out.println("\n=== Email + SMS ===");
        smsNotifier.send("User registered");

        System.out.println("\n=== Email + SMS + Slack ===");
        slackAndSMSNotifier.send("High-priority alert");

    }
}
