package lesson87;

public class Main {

    static class Avtomobil {
        String marka;
        String reng;
        int il;
    }

    public static void main(String[] args) {
        Avtomobil avto1 = new Avtomobil();
        avto1.marka = "BMW";
        avto1.reng = "Qara";
        avto1.il = 2022;

        Avtomobil avto2 = new Avtomobil();
        avto2.marka = "Mercedes";
        avto2.reng = "Ağ";
        avto2.il = 2023;

        System.out.println("1-ci avtomobil: " + avto1.marka + ", " + avto1.reng + ", " + avto1.il);
        System.out.println("2-ci avtomobil: " + avto2.marka + ", " + avto2.reng + ", " + avto2.il);
    }
}