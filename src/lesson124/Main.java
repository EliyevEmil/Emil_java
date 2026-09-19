package lesson124;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Student student = new Student("Əli", "Məmmədov");
        Teacher teacher = new Teacher("Aygün", "Həsənova");
        Library librarian = new Library("Leman", "Əliyeva");
        Driver driver = new Driver("Rauf", "Qasımov");

        school.door1(student);
        school.door1(driver);

        school.door2(teacher);
        school.door2(student);

        school.door3(teacher);
        school.door3(librarian);
        school.door3(driver);
    }
}