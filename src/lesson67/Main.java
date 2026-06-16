package lesson67;

public class Main {
    public static void main(String[] args) {
        String sentence = "Mən Java öyrənirəm və Java ilə layihələr hazırlayıram. Java öyərnmək mənim xoşuma gəlir";

        String axtarilanSoz = "Java";
        int saygac = 0;
        int indeks = sentence.indexOf(axtarilanSoz);

        while (indeks != -1) {
            saygac++;
            indeks = sentence.indexOf(axtarilanSoz, indeks + axtarilanSoz.length());
        }

        System.out.println("Mətndə '" + axtarilanSoz + "' sözünün sayı: " + saygac);
    }
}