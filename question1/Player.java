package question1;

// Represents a basketball player
public class Player {
    // Height of the player
    private double height;
    // Speed of the player
    private double speed;
    // Accuracy of the player
    private double accuracy;
    // Team to which the player belongs
    private Team team;

    // Constructor initializes the player with height, speed, accuracy, and team
    public Player(double height, double speed, double accuracy, Team team) {
        this.height = height;
        this.speed = speed;
        this.accuracy = accuracy;
        this.team = team;
    }

    // Sets the team of the player
    public void setTeam(Team team) {
        this.team = team;
    }

    // Calculates the score of the player based on their attributes
    public double getPlayerScore() {
        return height + speed + accuracy;  // Simplified scoring logic
    }
}

// Represents a basketball player with a scholarship
class ScholarshipPlayer extends Player {
    // Grade-point average of the scholarship player
    private double gpa;

    // Constructor initializes the scholarship player with height, speed, accuracy, team, and GPA
    public ScholarshipPlayer(double height, double speed, double accuracy, Team team, double gpa) {
        super(height, speed, accuracy, team);
        this.gpa = gpa;
    }
}