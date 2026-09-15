package lesson120;

public class Company {
    public Employee hire() {
        System.out.println("Company hired a general employee");
        return new Employee();
    }
}