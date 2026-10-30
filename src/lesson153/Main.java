package lesson153;

public class Main {
    public static void main(String[] args) {
        SchoolBell bell1 = SchoolBell.getInstance();
        SchoolBell bell2 = SchoolBell.getInstance();

        System.out.println("Eyni obyektmi? " + (bell1 == bell2));

        bell1.ring();
    }
}