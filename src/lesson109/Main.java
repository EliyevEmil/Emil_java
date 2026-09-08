package lesson109;

public class Main {
    public static void main(String[] args) {
        Animal aslan = new Predator("Simba", 5, "Rrrr");
        Animal dovsan = new Herbivore("Bobi", 2, "Pıx-pıx");

        ZooKeeper baxici = new ZooKeeper("Əli");

        System.out.println("=== ZOOPARK SİSTEMİ ===");

        baxici.heyvanaQulaqAs(aslan);
        baxici.heyvanaQulaqAs(dovsan);

        System.out.println("-------------------------");

        baxici.heyvanıQidalandır(aslan);
        baxici.heyvanıQidalandır(dovsan);
    }
}