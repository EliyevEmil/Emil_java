package lesson112;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo", 39);

        SportsClub club = new SportsClub("Real Madrid");
        club.addPlayer(player1);

        System.out.println("\nKlub silinməzdən əvvəl:");
        club.showClubInfo();

        club = null;
        System.out.println("\nSportsClub obyekti null edildi (klub silindi).");

        System.out.println("\nOyunçu obyektinin yoxlanılması:");
        if (player1 != null) {
            System.out.println("Oyunçu obyekti hələ də yaddaşda mövcuddur:");
            player1.showInfo();
        } else {
            System.out.println("Oyunçu obyekti silindi.");
        }
    }
}