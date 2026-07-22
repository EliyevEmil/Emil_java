package lesson100;

public class Tablet {
    String modelName;
    int serialNumber;
    static int counter = 1000;

    public Tablet(String modelName) {
        this.modelName = modelName;
        counter = counter + 1;
        this.serialNumber = counter;
    }

    public void showInfo() {
        System.out.println("Model: " + this.modelName + ", Seriya No: " + this.serialNumber);
    }

    public static int getTotalProducedCount() {
        return counter - 1000;
    }
}