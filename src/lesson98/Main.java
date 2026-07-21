package lesson98;

public class Main {
    public static void main(String[] args) {
        int eded = 1;
        int tekCem = 0;
        int cutCem = 0;

        while (eded <= 100) {
            if (eded % 2 == 0) {
                cutCem = cutCem + eded;
            } else {
                tekCem = tekCem + eded;
            }

            eded++;
        }

        int ferq = cutCem - tekCem;

        System.out.println("Cüt ədədlərin cəmi: " + cutCem);
        System.out.println("Tək ədədlərin cəmi: " + tekCem);
        System.out.println("Fərq (Cüt - Tək): " + ferq);
    }
}