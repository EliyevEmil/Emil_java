package lesson101;

public class Student {
    String name;
    int score;
    static int highestScore = 0;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        if (this.score > highestScore) {
            highestScore = this.score;
        }
    }

    public void displayInfo() {
        System.out.println(this.name + ": " + this.score);
    }

    public static void printHighestScore() {
        System.out.println("Ən yüksək bal: " + highestScore);
    }
}