package lesson153;

public class Main4 {
    public static void main(String[] args) {
        School school = new School();

        Student s1 = new Student("Nicat");
        Student s2 = new Student("Leyla");

        school.addObserver(s1);
        school.addObserver(s2);

        System.out.println("--- Vacib Elan ---");
        school.setAnnouncement("Saat 15:00-da tədbir olacaq!");
    }
}