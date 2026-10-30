package lesson153;

public class SchoolBell {
    private static SchoolBell instance;

    private SchoolBell() {
    }

    public static SchoolBell getInstance() {
        if (instance == null) {
            instance = new SchoolBell();
        }
        return instance;
    }

    public void ring() {
        System.out.println("Zəng çalındı");
    }
}