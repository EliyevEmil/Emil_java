package lesson94;

public class Main3 {
    public static void main(String[] args) {
        int testEdedi = 7;

        if (cutdur(testEdedi)) {
            System.out.println(testEdedi + " cütdür.");
        } else {
            System.out.println(testEdedi + " təkdir.");
        }
    }

    public static boolean cutdur(int eded) {
        return eded % 2 == 0;
    }
}