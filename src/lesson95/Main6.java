package lesson95;

public class Main6 {
    public static void main(String[] args) {
        Telebe t1 = new Telebe();
        Telebe t2 = new Telebe("Əli");
        Telebe t3 = new Telebe("Emil", 12);
    }

    static class Telebe {
        String ad;
        int yas;

        Telebe() {
            this.ad = "Naməlum";
            this.yas = 0;
            info();
        }

        Telebe(String ad) {
            this.ad = ad;
            this.yas = 0;
            info();
        }

        Telebe(String ad, int yas) {
            this.ad = ad;
            this.yas = yas;
            info();
        }

        public void info() {
            System.out.println("Tələbə -> Ad: " + ad + ", Yaş: " + yas);
        }
    }
}