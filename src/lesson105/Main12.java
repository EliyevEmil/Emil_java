package lesson105;

public class Main12 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1000);
        Employee emp2 = new Employee(2500);

        System.out.println("1-ci işçinin yekun maaşı: " + emp1.calculateFinalSalary());
        System.out.println("2-ci işçinin yekun maaşı: " + emp2.calculateFinalSalary());
    }
}