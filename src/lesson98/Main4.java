package lesson98;

public class Main4 {

    static class Programmer {
        String name;
        String surname;
        int age;
        double salary;

        public Programmer(String name, String surname) {
            this.name = name;
            this.surname = surname;
            this.age = 0;
            this.salary = 0.0;
        }

        public Programmer(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.salary = 0.0;
        }

        public Programmer(String name, String surname, int age, double salary) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.salary = salary;
        }

        public void melumatGoster() {
            System.out.println("Ad: " + name + ", Soyad: " + surname + ", Yaş: " + age + ", Maaş: " + salary);
        }
    }

    public static void main(String[] args) {
        Programmer p1 = new Programmer("Əli", "Məmmədov");
        Programmer p2 = new Programmer("Leyla", "Əliyeva", 22);
        Programmer p3 = new Programmer("Rauf", "Qasımov", 28, 3500.0);

        p1.melumatGoster();
        p2.melumatGoster();
        p3.melumatGoster();
    }
}