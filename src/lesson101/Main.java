package lesson101;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aysu", 78);
        Student s2 = new Student("Kamran", 92);
        Student s3 = new Student("Səbinə", 85);
        Student s4 = new Student("Elvin", 60);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();

        Student.printHighestScore();
    }
}