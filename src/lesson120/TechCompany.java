package lesson120;

public class TechCompany extends Company {
    @Override
    public Manager hire() {
        System.out.println("TechCompany hired a manager!");
        return new Manager();
    }
}