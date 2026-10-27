package lesson151;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.createNotification("EMAIL");
        n1.send("Salam, bu email mesajıdır!");

        Notification n2 = factory.createNotification("SMS");
        n2.send("Salam, bu SMS mesajıdır!");

        Notification n3 = factory.createNotification("PUSH");
        n3.send("Salam, bu push mesajıdır!");
    }
}