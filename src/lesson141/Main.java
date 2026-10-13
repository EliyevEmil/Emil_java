package lesson141;

public class Main {
    public static void main(String[] args) {

        Square sq = (int x) -> x * x;

        int netice = sq.calculate(5);

        System.out.println("Ededin kvadrati: " + netice);
    }
}