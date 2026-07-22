package lesson105;

public class Main9 {
    static int globalCount = 10;
    int instanceCount = 10;

    public static void main(String[] args) {
        Main9 obj1 = new Main9();
        Main9 obj2 = new Main9();
        Main9 obj3 = new Main9();

        Main9.globalCount = 50;
        obj1.instanceCount = 50;

        System.out.println("--- Static Dəyişən ---");
        System.out.println("obj1 static: " + Main9.globalCount);
        System.out.println("obj2 static: " + Main9.globalCount);
        System.out.println("obj3 static: " + Main9.globalCount);

        System.out.println("\n--- Non-Static Dəyişən ---");
        System.out.println("obj1 instance: " + obj1.instanceCount);
        System.out.println("obj2 instance: " + obj2.instanceCount);
        System.out.println("obj3 instance: " + obj3.instanceCount);
    }
}