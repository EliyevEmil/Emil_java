package lesson92;

public class Main3 {
    public static void main(String[] args) {
        maksimum(5, 12, 8);
        maksimum(45, 23, 11);
        maksimum(3, 7, 19);
    }

    public static void maksimum(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("En boyuk eded: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("En boyuk eded: " + b);
        } else {
            System.out.println("En boyuk eded: " + c);
        }
    }
}