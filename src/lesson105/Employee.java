package lesson105;

public class Employee {
    static double taxRate = 0.20;
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double calculateFinalSalary() {
        return salary - (salary * taxRate);
    }
}