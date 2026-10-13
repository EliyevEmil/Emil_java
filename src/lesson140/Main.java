package lesson140;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ali", 45));
        studentList.add(new Student("Leyla", 85));
        studentList.add(new Student("Murad", 92));
        studentList.add(new Student("Aysel", 40));
        studentList.add(new Student("Rauf", 70));

        System.out.println("--- Balı 50-dən böyük olanlar ---");
        for (Student s : studentList) {
            if (s.score > 50) {
                System.out.println(s.name + " - " + s.score);
            }
        }

        System.out.println("\n--- Adlar böyük hərflə ---");
        for (Student s : studentList) {
            String buyukAd = s.name.toUpperCase();
            System.out.println(buyukAd + " - " + s.score);
        }

        int maxScore = studentList.get(0).score;

        for (Student s : studentList) {
            if (s.score > maxScore) {
                maxScore = s.score;
            }
        }

        System.out.println("\n--- Ən yüksək bal ---");
        System.out.println("En yuksek bal: " + maxScore);
    }
}