package lesson153;

public class Main5 {
    public static void main(String[] args) {
        Car2 car = new Car2.Builder()
                .setBrand("Mercedes")
                .setModel("G63")
                .setYear(2024)
                .setColor("Qırmızı")
                .build();

        car.showInfo();
    }
}