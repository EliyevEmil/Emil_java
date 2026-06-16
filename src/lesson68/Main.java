package lesson68;

public class Main {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("--- String Pool Yoxlanışı ---");

        boolean eyniReferans1 = (s1 == s2);
        System.out.println("s1 == s2 nəticəsi: " + eyniReferans1);

        boolean eyniReferans2 = (s1 == s3);
        System.out.println("s1 == s3 nəticəsi: " + eyniReferans2);

        boolean deyerlerEynidirmi = s1.equals(s3);
        System.out.println("s1.equals(s3) nəticəsi: " + deyerlerEynidirmi);
    }
}