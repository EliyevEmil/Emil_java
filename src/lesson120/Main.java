package lesson120;

public class Main {
    public static void main(String[] args) {
        TechCompany tech = new TechCompany();

        Manager m = tech.hire();

        m.work();
        m.manage();
    }
}