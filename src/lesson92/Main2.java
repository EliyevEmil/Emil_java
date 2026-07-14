package lesson92;

public class Main2 {
    public static void main(String[] args) {
        cutTek(4);
        cutTek(7);
        cutTek(12);
        cutTek(25);
        cutTek(30);
    }

    public static void cutTek(int eded) {
        if (eded % 2 == 0) {
            System.out.println(eded + " cut ededdir");
        } else {
            System.out.println(eded + " tek ededdir");
        }
    }
}