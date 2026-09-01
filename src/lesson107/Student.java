package lesson107;

public record Student(String name, int age, double grade) {

    public boolean isPassed() {
        return grade >= 51;
    }
}