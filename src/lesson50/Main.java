package lesson50;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger hasil = BigInteger.ONE;
        int cem = 0;

        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0) {
                cem = cem + i;
                hasil = hasil.multiply(BigInteger.valueOf(i));
            }
        }

        BigInteger cemBig = BigInteger.valueOf(cem);
        BigInteger ferq = hasil.subtract(cemBig);

        System.out.println(ferq);
    }
}