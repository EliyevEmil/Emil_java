package lesson151;

public class EmailNotification implements Notification {
    @Override
    public void send(String text) {
        System.out.println("Email ilə göndərildi: " + text);
    }
}