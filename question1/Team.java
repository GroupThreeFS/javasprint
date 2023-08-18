package question1;
import java.util.ArrayList;
import java.util.List;

// Represents a basketball team
public class Team {
    // Name of the team
    private String name;
    // List of players in the team
    private List<Player> players = new ArrayList<>();

    // Constructor initializes the team with a name and 12 players
    public Team(String name) {
        this.name = name;
        for (int i = 0; i < 12; i++) {
            players.add(new Player(180 + i, 10 + i, 80 + i, this));
        }
    }

    // Transfers a player from this team to another team
    public void transferPlayer(Player player, Team toTeam) {
        players.remove(player);
        toTeam.addPlayer(player);
        player.setTeam(toTeam);
    }

    // Adds a player to the team
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Calculates the total score of the team based on player attributes
    public double getTeamScore() {
        return players.stream().mapToDouble(Player::getPlayerScore).sum();
    }

    @Override
    public String toString() {
        return name;
    }
}