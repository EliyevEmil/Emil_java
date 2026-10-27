package lesson151;

public class PushNotification implements Notification {
    @Override
    public void send(String text) {
        System.out.println("Push notification ilə göndərildi: " + text);
    }
}