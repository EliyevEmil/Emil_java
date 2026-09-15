package lesson119;

public interface Notification {
    void send(String msg);

    default void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}