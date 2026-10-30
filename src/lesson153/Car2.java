package lesson153;

public class Car2 {
    private String brand;
    private String model;
    private int year;
    private String color;

    private Car2(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public void showInfo() {
        System.out.println("Maşın: " + brand + " " + model + ", İl: " + year + ", Rəng: " + color);
    }

    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private String color;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car2 build() {
            return new Car2(this);
        }
    }
}