package lesson114;

public class Main {

    public static void show(String name) {
        System.out.println("Salam, mənim adım " + name + "-dır.");
    }

    public static void show(String name, int age) {
        System.out.println("Mənim adım " + name + "-dır və " + age + " yaşım var.");
    }

    public static void main(String[] args) {
        show("Emil");
        show("Emil", 12);
    }
}