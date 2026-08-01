package lesson106;

public class Main3 {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        System.out.println("Əməliyyat sistemi: " + osName);

        long startTime = System.currentTimeMillis();

        long sum = 0;
        for (int i = 1; i <= 100000000; i++) {
            sum = sum + i;
        }

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;

        System.out.println("Bu kod " + duration + " millisaniyə ərzində icra olundu.");
    }
}