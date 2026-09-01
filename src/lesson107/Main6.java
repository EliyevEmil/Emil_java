package lesson107;

import java.math.BigInteger;

public class Main6 {
    public static void main(String[] args) {
        BigInteger eded1 = new BigInteger("999999999999999999999");
        BigInteger eded2 = new BigInteger("111111111111111111111");

        BigInteger cem = eded1.add(eded2);

        System.out.println("Ədəd 1: " + eded1);
        System.out.println("Ədəd 2: " + eded2);
        System.out.println("Cəm: " + cem);
    }
}