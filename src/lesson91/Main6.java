package lesson91;

public class Main6 {
    static int saygac = 0;

    public static void main(String[] args) {
        metoduSay();
        metoduSay();
        metoduSay();
        metoduSay();
        metoduSay();
    }

    static void metoduSay() {
        saygac++;
        System.out.println("Bu metod " + saygac + " dəfə çağırıldı");
    }
}