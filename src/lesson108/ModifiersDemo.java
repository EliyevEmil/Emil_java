package lesson108;

public class ModifiersDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printName();
        p1.printAge();
        p1.printGame();

        System.out.println("--------------------");

        Person p2 = new Person("Murad");
        p2.printScore(100);

        System.out.println("--------------------");

        Person p3 = new Person("Leyla", 12);
        p3.showAllInfo();

        System.out.println("--------------------");

        System.out.println("Yaradılan toplam Person sayı: " + Person.personCount);
    }
}