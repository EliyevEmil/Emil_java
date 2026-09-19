package lesson121;

public class TechCompany extends Company {
    @Override
    public Manager hire() {
        return new Manager();
    }
}