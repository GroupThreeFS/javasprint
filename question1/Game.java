package question1;

// Represents a basketball game between two teams
public class Game {
    // First team in the game
    private Team team1;
    // Second team in the game
    private Team team2;
    // Result of the game
    private String result;

    // Constructor initializes the game with two teams and determines the result
    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.result = determineResult();
    }

    // Determines the result of the game based on team scores
    private String determineResult() {
        double team1Score = team1.getTeamScore();
        double team2Score = team2.getTeamScore();

        if (team1Score > team2Score) {
            return team1 + " wins!";
        } else if (team1Score < team2Score) {
            return team2 + " wins!";
        } else {
            return "It's a tie!";
        }
    }

    @Override
    public String toString() {
        return result;
    }

}