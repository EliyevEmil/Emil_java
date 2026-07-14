package lesson92;

public class Main4 {
    public static void main(String[] args) {
        ucbucaq(5);
    }

    public static void ucbucaq(int setir) {
        for (int i = 1; i <= setir; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}