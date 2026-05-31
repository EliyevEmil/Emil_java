package lesson28;

public class Main {
    public static void main(String[] args) {
        int age = 20;
        boolean isStudent = true;

        if (age > 65 || isStudent) {
            System.out.println("Endirim qazandiniz");
        } else {
            System.out.println("Endirim yoxdur");
        }
    }
}