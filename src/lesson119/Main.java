package lesson119;

public class Main {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        email.send("Hello");
        email.log("Hello");

        SmsNotification sms = new SmsNotification();
        sms.send("Hello");
        sms.log("Hello");
    }
}