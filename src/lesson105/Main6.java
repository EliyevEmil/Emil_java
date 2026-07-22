package lesson105;

public class Main6 {
    static int counter = 0;

    public Main6() {
        counter++;
    }

    public static void main(String[] args) {
        Main6 obj1 = new Main6();
        Main6 obj2 = new Main6();
        Main6 obj3 = new Main6();

        System.out.println("Cəmi yaradılan obyekt sayı: " + Main6.counter);
    }
}