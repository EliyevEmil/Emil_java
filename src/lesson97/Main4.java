package lesson97;

public class Main4 {

    static void nullEt(int[] arr) {
        arr = null;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30};
        nullEt(data);
        System.out.println(data[0]);
    }
}