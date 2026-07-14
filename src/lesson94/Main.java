package lesson94;

public class Main {
    public static void main(String[] args) {
        salamVoid();

        String mesaj = salamReturn();
        System.out.println(mesaj);
    }

    public static void salamVoid() {
        System.out.println("Salam");
    }

    public static String salamReturn() {
        return "Salam";
    }
}