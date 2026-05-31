package lesson40;

public class Main {
    public static void main(String[] args) {
        short result = (short) (Short.MIN_VALUE - 1);

        System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE);
        System.out.println("Short.MIN_VALUE - 1 nəticəsi (result): " + result);
        System.out.println("Short.MAX_VALUE: " + Short.MAX_VALUE);

        System.out.println("result == Short.MAX_VALUE müqayisəsi: " + (result == Short.MAX_VALUE));
    }
}