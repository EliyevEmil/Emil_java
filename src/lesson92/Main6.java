package lesson92;

public class Main6 {
    public static void main(String[] args) {
        hesabla(10, 5, '+');
        hesabla(10, 5, '-');
        hesabla(10, 5, '*');
        hesabla(10, 5, '/');
        hesabla(10, 0, '/');
    }

    public static void hesabla(int a, int b, char operator) {
        if (operator == '+') {
            System.out.println("Neticə: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Neticə: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Neticə: " + (a * b));
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Xəbərdarlıq: Sıfıra bölmək olmaz!");
            } else {
                System.out.println("Neticə: " + (a / b));
            }
        } else {
            System.out.println("Yanlış operator!");
        }
    }
}