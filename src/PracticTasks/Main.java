package PracticTasks;

public class Main {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int netice = a / b;
            System.out.println("Nəticə: " + netice);
        } catch (ArithmeticException e) {
            System.out.println("Xəta baş verdi: Ədədi sıfıra bölmək olmaz!");
        }

        System.out.println("-----------------------------------");
        try{
            int[] ededler = {10, 20, 30};
            System.out.println("Massiv elementi: " + ededler[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xeta bas verdi: Massivde bele bir indeks yoxdur!");
        }
    }
}