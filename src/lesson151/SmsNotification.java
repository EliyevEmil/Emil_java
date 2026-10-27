package lesson151;

public class SmsNotification implements Notification {
    @Override
    public void send(String text) {
        System.out.println("SMS ilə göndərildi: " + text);
    }
}