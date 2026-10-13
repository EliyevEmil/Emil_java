package lesson142;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 45));
        students.add(new Student("Leyla", 85));
        students.add(new Student("Murad", 92));
        students.add(new Student("Aysel", 40));

        Function<Student, String> nameExtractor = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        };

        Predicate<Student> passingPredicate = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getScore() >= 50;
            }
        };

        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Imtahandan kecen telebe: " + name);
            }
        };

        students.stream()
                .filter(passingPredicate)
                .map(nameExtractor)
                .forEach(printer);
    }
}