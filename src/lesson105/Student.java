package lesson105;

public class Student {
    static int totalStudents = 0;
    String name;

    public Student(String name) {
        this.name = name;
        totalStudents++;
    }
}