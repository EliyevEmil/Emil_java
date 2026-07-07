package lesson90;

public class Main2 {
    public static void main(String[] args) {
        Car masin1 = new Car();
        masin1.brand = "Toyota";
        masin1.year = 2022;

        Car masin2 = new Car();
        masin2.brand = "BMW";
        masin2.year = 2025;

        Driver surucu1 = new Driver();
        surucu1.name = "Əli";
        surucu1.experienceYear = 5;

        Driver surucu2 = new Driver();
        surucu2.name = "Vəli";
        surucu2.experienceYear = 10;

        masin1.showCar();
        masin2.showCar();

        System.out.println("--------------------");

        surucu1.showDriver();
        surucu2.showDriver();
    }
}

class Car {
    String brand;
    int year;

    public void showCar() {
        System.out.println("Maşın: " + brand + ", İli: " + year);
    }
}

class Driver {
    String name;
    int experienceYear;

    public void showDriver() {
        System.out.println("Sürücü: " + name + ", Təcrübəsi: " + experienceYear + " il");
    }
}