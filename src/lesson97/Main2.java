package lesson97;

public class Main2 {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        swap(x, y);
        System.out.println("x = " + x + ", y = " + y);
    }
}