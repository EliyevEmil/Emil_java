package lesson92;

public class Main7 {
    public static void main(String[] args) {
        tekrarla("Java", 3);
    }

    public static void tekrarla(String soz, int say) {
        for (int i = 0; i < say; i++) {
            System.out.print(soz + " ");
        }
        System.out.println();
    }
}