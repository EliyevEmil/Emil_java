package lesson104;

import java.util.Scanner;

public class CircleCalculator {

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci dairənin radiusunu daxil edin: ");
        double r1 = scanner.nextDouble();

        double area = Math.PI * Math.pow(r1, 2);
        long roundedArea = Math.round(area);

        System.out.println("Dairənin sahəsi: " + area);
        System.out.println("Yuvarlaqlaşdırılmış sahə: " + roundedArea);

        System.out.print("İkinci dairənin radiusunu daxil edin: ");
        double r2 = scanner.nextDouble();

        double maxRadius = Math.max(r1, r2);
        System.out.println("Böyük olan radius: " + maxRadius);
    }
}