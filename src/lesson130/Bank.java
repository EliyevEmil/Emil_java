package lesson130;

public class Bank implements CreditAble {

    @Override
    public void credit(Person p, double amount) {
        if (p.getSalary() > 500) {
            System.out.println(p.getName() + " " + p.getSurname() + " üçün " + amount + " AZN kredit təsdiqləndi.");
        } else {
            System.out.println(p.getName() + " " + p.getSurname() + " üçün kredit imtina edildi (Maaş 500-dən yuxarı olmalıdır).");
        }
    }

    @Override
    public void specialCredit(Person p, double amount) {
        if (p instanceof Developer) {
            System.out.println("Xüsusi Kredit: Developer " + p.getName() + " " + p.getSurname() + " üçün " + amount + " AZN kredit təsdiqləndi!");
        } else {
            System.out.println("Xüsusi Kredit imtina edildi: " + p.getName() + " Developer deyil.");
        }
    }
}