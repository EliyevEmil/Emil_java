package lesson156;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "-ci telebenin id, name, age, grade daxil et:");
            int id = sc.nextInt();
            String name = sc.next();
            int age = sc.nextInt();
            double grade = sc.nextDouble();

            Student st = new Student(id, name, age, grade);
            list.add(st);
        }

        System.out.println("\n--- Butun telebeler ---");
        for (Student s : list) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getAge() + " " + s.getGrade());
        }

        Student maxStudent = list.get(0);
        for (Student s : list) {
            if (s.getGrade() > maxStudent.getGrade()) {
                maxStudent = s;
            }
        }
        System.out.println("\nEn yuksek bal toplayan: " + maxStudent.getName() + " - " + maxStudent.getGrade());

        System.out.println("\nYasi 20-den boyuk olanlar:");
        for (Student s : list) {
            if (s.getAge() > 20) {
                System.out.println(s.getName() + " - " + s.getAge());
            }
        }
    }
}