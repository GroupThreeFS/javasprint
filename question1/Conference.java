package question1;
import java.util.ArrayList;
import java.util.List;

// Represents a basketball conference
public class Conference {
    // List of teams in the conference
    private List<Team> teams = new ArrayList<>();

    // Constructor initializes the conference with 10 teams
    public Conference() {
        for (int i = 0; i < 10; i++) {
            teams.add(new Team("Team " + (i + 1)));
        }
    }

    // Returns the list of teams in the conference
    public List<Team> getTeams() {
        return teams;
    }
}