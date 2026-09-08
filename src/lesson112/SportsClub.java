package lesson112;

import java.util.ArrayList;
import java.util.List;

public class SportsClub {
    private String clubName;
    private List<Player> players;

    public SportsClub(String clubName) {
        this.clubName = clubName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.getName() + " " + clubName + " klubuna əlavə olundu.");
    }

    public void showClubInfo() {
        System.out.println("=== " + clubName + " Klubu ===");
        for (Player p : players) {
            p.showInfo();
        }
    }
}