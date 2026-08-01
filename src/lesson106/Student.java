package lesson106;

public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Tələbənin adı: " + name);
        System.out.println("Yaşı: " + age);
        System.out.println("Qiyməti: " + grade);
    }

    public boolean isPassed() {
        if (grade >= 51) {
            return true;
        } else {
            return false;
        }
    }

    public void increaseGrade(double amount) {
        grade = grade + amount;
        System.out.println("Qiymət " + amount + " bal artırıldı!");
    }
}