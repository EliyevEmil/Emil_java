package lesson62;

public class Main {
    public static void main(String[] args) {

        int eded = 29;
        boolean sade = true;

        if (eded <= 1) {
            sade = false;
        } else {
            for (int i = 2; i < eded; i++) {
                if (eded % i == 0) {
                    sade = false;
                    break;
                }
            }
        }

        if (sade) {
            System.out.println("Sade ededdir");
        } else {
            System.out.println("Murekkeb ededdir");
        }

    }
}