package lesson128;

public class CheckVehicle {
    public static void checkVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            System.out.println("Bu obyekt bir Maşındır (Car)!");
        } else if (vehicle instanceof Bike) {
            System.out.println("Bu obyekt bir Velosipeddir (Bike)!");
        } else {
            System.out.println("Bu sadəcə ümumi bir Nəqliyyat vasitəsidir (Vehicle)!");
        }
    }
}