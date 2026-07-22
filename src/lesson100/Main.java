package lesson100;

public class Main {
    public static void main(String[] args) {
        Tablet tab1 = new Tablet("iPad");
        Tablet tab2 = new Tablet("Galaxy Tab");
        Tablet tab3 = new Tablet("Xiaomi Pad");

        tab1.showInfo();
        tab2.showInfo();
        tab3.showInfo();

        System.out.println("Cəmi istehsal olunan planşet sayı: " + Tablet.getTotalProducedCount());
    }
}