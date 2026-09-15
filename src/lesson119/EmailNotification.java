package lesson119;

public class EmailNotification implements Notification {
    @Override
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}