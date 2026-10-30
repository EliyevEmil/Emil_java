package lesson153;

public class Main2 {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("CAR");
        car.move();

        Vehicle bike = factory.createVehicle("BIKE");
        bike.move();
    }
}