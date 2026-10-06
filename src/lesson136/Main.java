package lesson136;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> noxbe = new LinkedList<>();

        noxbe.add("Emil");
        noxbe.add("Seid");
        noxbe.offer("Ali");

        System.out.println("Növbədəki ilk adam (peek): " + noxbe.peek());

        System.out.println("Növbədən çıxan (poll): " + noxbe.poll());
        System.out.println("Növbədən çıxan (remove): " + noxbe.remove());

        System.out.println("Qalan növbə: " + noxbe);
        System.out.println("Növbə boşdur? " + noxbe.isEmpty());
        System.out.println("Növbənin ölçüsü: " + noxbe.size());

        Queue<Integer> ededler = new PriorityQueue<>();

        ededler.add(40);
        ededler.add(10);
        ededler.add(20);

        System.out.println("PriorityQueue ilk elementi: " + ededler.peek());
        System.out.println("PriorityQueue-dən çıxarılır: " + ededler.poll());
    }
}