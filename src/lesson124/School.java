package lesson124;

public class School {

    public void door1(Person person) {
        System.out.println("Qapı 1-dən girdi: " + person.ad + " " + person.soyad);
    }

    public void door2(Person person) {
        if (person instanceof Teacher) {
            System.out.println("Qapı 2-dən müəllim girdi: " + person.ad + " " + person.soyad);
        } else {
            System.out.println("XƏTA! Qapı 2-dən ancaq müəllimlər keçə bilər: " + person.ad + " " + person.soyad + " daxil ola bilmədi!");
        }
    }

    public void door3(Person person) {
        if (person instanceof Teacher || person instanceof Library) {
            System.out.println("Qapı 3-dən girdi: " + person.ad + " " + person.soyad);
        } else {
            System.out.println("XƏTA! Qapı 3-dən ancaq müəllim və kitabxanaçı keçə bilər: " + person.ad + " " + person.soyad + " daxil ola bilmədi!");
        }
    }
}