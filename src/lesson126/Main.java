package lesson126;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1-ci Ssenari ===");
        try {
            String metn = null;
            System.out.println(metn.length());
        } catch (NullPointerException e) {
            System.out.println("Xəta tapıldı: NullPointerException!");
            System.out.println("Səbəb: Obyekt null olduğu üçün onun metodunu çağıra bilmədik.\n");
        }

        System.out.println("=== 2-ci Ssenari ===");
        try {
            File fayl = new File("olmayan_fayl.txt");
            Scanner faylOxuyan = new Scanner(fayl);
        } catch (FileNotFoundException e) {
            System.out.println("Xəta tapıldı: FileNotFoundException!");
            System.out.println("Səbəb: Axtarılan fayl kompyuterin yaddaşında tapılmadı.\n");
        }

        System.out.println("=== 3-cü Ssenari ===");
        try {
            Scanner daxilEt = new Scanner("alma");
            int eded = daxilEt.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Xəta tapıldı: InputMismatchException!");
            System.out.println("Səbəb: Proqram ədəd gözləyirdi, amma istifadəçi mətn daxil etdi.\n");
        }

        System.out.println("=== 4-cü Ssenari ===");
        try {
            String yalnizMetn = "abc";
            int cevrilenEded = Integer.parseInt(yalnizMetn);
        } catch (NumberFormatException e) {
            System.out.println("Xəta tapıldı: NumberFormatException!");
            System.out.println("Səbəb: 'abc' yazısını rəqəmə çevirmək mümkün deyil.");
        }

    }
}