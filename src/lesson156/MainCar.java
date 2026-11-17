package lesson156;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 200);
        Car mercedes = new Car("Mercedes", 180);
        Car lada = new Car("Lada", 120);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(bmw);
        cars.add(mercedes);
        cars.add(lada);

        Car winner = cars.get(0);
        for (Car c : cars) {
            if (c.getSpeed() > winner.getSpeed()) {
                winner = c;
            }
        }

        System.out.println("Yarisin qalibi: " + winner.getName() + " (" + winner.getSpeed() + " km/s)");
    }
}