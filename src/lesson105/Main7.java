package lesson105;

public class Main7 {
    String username;

    public Main7(String username) {
        this.username = username;
    }

    public static void main(String[] args) {
        Main7 user1 = new Main7("Əli");
        Main7 user2 = new Main7("Aysel");

        System.out.println("İstifadəçi 1: " + user1.username);
        System.out.println("İstifadəçi 2: " + user2.username);
    }
}