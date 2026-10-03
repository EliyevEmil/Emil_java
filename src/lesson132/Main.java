package lesson132;

public class Main {
    public static void main(String[] args) {

        Qutu<String> adQutusu = new Qutu<>();
        adQutusu.qoy("Emil");
        System.out.println("Qutudakı ad: " + adQutusu.gotur());

        Qutu<Integer> ededQutusu = new Qutu<>();
        ededQutusu.qoy(12);
        System.out.println("Qutudakı ədəd: " + ededQutusu.gotur());

        String[] oyunlar = {"Roblox", "Minecraft", "FIFA"};
        Integer[] xallar = {100, 250, 500};

        System.out.print("Oyunlar: ");
        Metodlar.massiviCapEt(oyunlar);

        System.out.print("Xallar: ");
        Metodlar.massiviCapEt(xallar);
    }
}