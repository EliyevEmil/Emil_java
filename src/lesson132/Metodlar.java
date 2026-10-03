package lesson132;

public class Metodlar {

    public static <E> void massiviCapEt(E[] massiv) {
        for (E element : massiv) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}