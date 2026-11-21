package lesson157;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student("Emil", LocalDateTime.of(2026, 10, 15, 10, 0));
        s1.addGrade(80);
        s1.addGrade(70);

        Student s2 = new Student("Seid", LocalDateTime.of(2026, 11, 25, 14, 30));
        s2.addGrade(50);
        s2.addGrade(55);

        Student s3 = new Student("Aysel", LocalDateTime.of(2026, 5, 10, 9, 0));
        s3.addGrade(90);
        s3.addGrade(85);

        Student s4 = new Student("Murad", LocalDateTime.of(2026, 12, 5, 11, 0));
        s4.addGrade(75);
        s4.addGrade(65);

        Student s5 = new Student("Nigar", LocalDateTime.of(2026, 1, 20, 15, 0));
        s5.addGrade(40);
        s5.addGrade(60);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        LocalDateTime now = LocalDateTime.now();
        List<Student> pastExamStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getExamDate().isBefore(now)) {
                pastExamStudents.add(student);
            }
        }

        System.out.println("İmtahan tarixi bugündən əvvəl olan tələbələr:");
        for (Student student : pastExamStudents) {
            System.out.println(student);
        }
    }
}