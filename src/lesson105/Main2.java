package lesson105;

public class Main2 {
    static String schoolName = "Məktəb №1";
    String studentName;

    public Main2(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Main2 sagird1 = new Main2("Əli");
        Main2 sagird2 = new Main2("Aysel");

        System.out.println(sagird1.studentName + " -> " + Main2.schoolName);
        System.out.println(sagird2.studentName + " -> " + Main2.schoolName);

        Main2.schoolName = "Məktəb №5";

        System.out.println("--- Dəyişiklikdən sonra ---");
        System.out.println(sagird1.studentName + " -> " + Main2.schoolName);
        System.out.println(sagird2.studentName + " -> " + Main2.schoolName);
    }
}