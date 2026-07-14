package lesson92;

public class Main5 {
    public static void main(String[] args) {
        celsiusToFahrenheit(25.0);
        fahrenheitToCelsius(77.0);
    }

    public static void celsiusToFahrenheit(double c) {
        double f = c * 9 / 5 + 32;
        System.out.println(c + " Celsius = " + f + " Fahrenheit");
    }

    public static void fahrenheitToCelsius(double f) {
        double c = (f - 32) * 5 / 9;
        System.out.println(f + " Fahrenheit = " + c + " Celsius");
    }
}