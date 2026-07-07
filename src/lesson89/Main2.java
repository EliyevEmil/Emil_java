package lesson89;

public class Main2 {
    public static void main(String[] args) {
        Student telebe = new Student();
        telebe.melumatiGoster();
    }
}

class Student {
    String name;
    int age;

    public Student() {
        name = "Unknown";
        age = 0;
    }

    public void melumatiGoster() {
        System.out.println("Tələbənin adı: " + name);
        System.out.println("Yaşı: " + age);
    }
}