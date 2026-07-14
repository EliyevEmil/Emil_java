package lesson93;

public class Main7 {
    public static void main(String[] args) {
        qiymetHesabla(50.0, 3, 10.0);
        qiymetHesabla(12.5, 4, 20.0);
        qiymetHesabla(100.0, 2, 5.0);
    }

    public static void qiymetHesabla(double qiymet, int say, double endirim) {
        double cem = qiymet * say;
        double yekun = cem - (cem * endirim / 100);
        System.out.println("Cəm: " + cem + ", Endirim: " + endirim + "%, Yekun: " + yekun);
    }
}