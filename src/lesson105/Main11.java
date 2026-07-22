package lesson105;

public class Main11 {
    public static void main(String[] args) {
        System.out.println("Əvvəl tələbə sayı: " + Student.totalStudents);

        Student s1 = new Student("Əli");
        Student s2 = new Student("Aysel");
        Student s3 = new Student("Murad");

        System.out.println("İndi cəmi tələbə sayı: " + Student.totalStudents);
    }
}