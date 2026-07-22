package lesson105;

public class Main10 {
    static String schoolName = "Məktəb №1";
    String studentName;

    public Main10(String name) {
        this.studentName = name;
    }

    public static void main(String[] args) {
        Main10 sagird1 = new Main10("Əli");

        System.out.println("Tələbə: " + sagird1.studentName);
        System.out.println("Məktəb: " + Main10.schoolName);
    }
}