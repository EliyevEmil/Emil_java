package lesson27;

public class Main {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";

        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Giris ugurludur");
        } else {
            System.out.println("Username ve ya password yanlisdir");
        }
    }
}