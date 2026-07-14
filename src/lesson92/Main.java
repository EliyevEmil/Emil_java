package lesson92;

public class Main {
    public static void main(String[] args) {
        kvadratCek(4);
    }

    public static void kvadratCek(int olcu) {
        for (int i = 0; i < olcu; i++) {
            for (int j = 0; j < olcu; j++) {
                if (i == 0 || i == olcu - 1 || j == 0 || j == olcu - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}