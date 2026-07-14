package lesson94;

public class Main4 {
    public static void main(String[] args) {
        int boyukEded = maks3(15, 42, 23);
        System.out.println("Ən böyük ədəd: " + boyukEded);
    }

    public static int maks(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int maks3(int a, int b, int c) {
        return maks(maks(a, b), c);
    }
}