package lesson102;

public class UnitConverter {

    private UnitConverter() {
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double kilometersToMiles(double km) {
        return km * 0.621;
    }

    public static double kilogramsToPounds(double kg) {
        return kg * 2.204;
    }
}