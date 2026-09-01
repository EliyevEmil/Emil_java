package lesson107;

public class Main2 {
    public static void main(String[] args) {
        double kesrSayi = 5.5;
        Double wrapperDouble = kesrSayi;

        char simvol = 'A';
        Character wrapperChar = simvol;

        boolean mentiq = true;
        Boolean wrapperBoolean = mentiq;

        System.out.println("Double: " + wrapperDouble);
        System.out.println("Character: " + wrapperChar);
        System.out.println("Boolean: " + wrapperBoolean);
    }
}