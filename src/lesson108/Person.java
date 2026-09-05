package lesson108;

public class Person {
    public String name = "Ali";
    protected int age = 12;
    String favoriteGame = "Roblox";
    private String secretNote = "Mənim gizli gündəliyim";

    public static int personCount = 0;

    public Person() {
        personCount++;
        System.out.println("Yeni bir Person yaradıldı (Public).");
    }

    protected Person(String name) {
        this.name = name;
        personCount++;
        System.out.println("Adı olan Person yaradıldı (Protected): " + name);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        personCount++;
        System.out.println("Adı və yaşı olan Person yaradıldı (Default).");
    }

    private Person(String name, int age, String favoriteGame) {
        this.name = name;
        this.age = age;
        this.favoriteGame = favoriteGame;
        personCount++;
        System.out.println("Bütün məlumatları olan Person yaradıldı (Private).");
    }

    public void printName() {
        System.out.println("Mənim adım: " + name);
    }

    protected void printAge() {
        System.out.println("Mənim yaşım: " + age);
    }

    void printGame() {
        System.out.println("Sevdiyim oyun: " + favoriteGame);
    }

    private void printSecret() {
        System.out.println("Gizli sözüm: " + secretNote);
    }

    public void printScore(final int score) {
        System.out.println("Topladığım xal: " + score);
    }

    public void showAllInfo() {
        printName();
        printAge();
        printGame();
        printSecret();
    }
}