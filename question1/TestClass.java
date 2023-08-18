package question1;

public class TestClass {
    public static void main(String[] args) {
        // Create the Bugs Bunny Basketball Team
        Team bugsBunnyTeam = new Team("Bugs Bunny Basketball Team");

        // Add players to the team
        Player bugs = new Player(190, 15, 90, bugsBunnyTeam);
        Player daffy = new Player(180, 12, 85, bugsBunnyTeam);
        Player lola = new Player(188, 14, 88, bugsBunnyTeam);
        Player taz = new Player(170, 20, 80, bugsBunnyTeam);
        Player porky = new Player(175, 10, 82, bugsBunnyTeam);

        // Add a scholarship player (for demonstration)
        ScholarshipPlayer michaelJordan = new ScholarshipPlayer(198, 25, 95, bugsBunnyTeam, 3.8);

        // Add players to the team
        bugsBunnyTeam.addPlayer(bugs);
        bugsBunnyTeam.addPlayer(daffy);
        bugsBunnyTeam.addPlayer(lola);
        bugsBunnyTeam.addPlayer(taz);
        bugsBunnyTeam.addPlayer(porky);
        bugsBunnyTeam.addPlayer(michaelJordan);

        // Display team score
        System.out.println("Team Score for " + bugsBunnyTeam + ": " + bugsBunnyTeam.getTeamScore());

        // For demonstration, let's create an opponent team
        Team opponentTeam = new Team("Monstars");

        // Transfer Daffy from Bugs Bunny Basketball Team to Monstars
        System.out.println("\nTransferring Daffy from " + bugsBunnyTeam + " to " + opponentTeam);
        bugsBunnyTeam.transferPlayer(daffy, opponentTeam);
        System.out.println("Transfer complete!");

        // Play a game between the two teams
        Game game = new Game(bugsBunnyTeam, opponentTeam);
        System.out.println("\nGame Result: " + game);
    }
}