package lesson90;

public class Main {
    public static void main(String[] args) {
        Student telebe = new Student();
        telebe.name = "Emil";
        telebe.age = 12;

        System.out.println("Tələbənin adı: " + telebe.name);
        System.out.println("Yaşı: " + telebe.age);
    }
}

class Student {
    String name;
    int age;
}