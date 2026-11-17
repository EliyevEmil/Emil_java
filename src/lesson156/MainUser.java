package lesson156;

public class MainUser {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("emil123");

        u.setPassword("123");
        u.setPassword("myPassword123");

        System.out.println("Username: " + u.getUsername());
        System.out.println("Password: " + u.getPassword());
    }
}