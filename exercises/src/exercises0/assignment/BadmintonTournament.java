package exercises0.assignment;

/*
We want to model a double (2 vs.  2) badminton tournament.
Write a class to represent a badminton player.  A player has a first name, a last name,
an age, a number of won and lost matches, and an optional sponsor.  Write appropriate
constructors for the player class.  Add a method to the player class to compute that
player’s win-loss ratio.
Write a class to represent a team.  A team has a team name and consists of two players.
Add an appropriate constructor.  Add a method to compute the average age of the team.
Write a class to represent a single match between two teams, red and blue.  Add an
appropriate constructor.  Add a method to compute the average age of all the players
in the match.  Add a method to find the player with the best win-lost ratio of all the
players in the match.  Add a method to signal that one team has won/lost the match
and update the player statistics of each player accordingly.
 */

import java.lang.String;

public class BadmintonTournament {

    public static void main(String[] args) {

        Player John = new Player("John", "Doe", 20, 4, 3);
        Player Joe = new Player("Joe", "Smith",22, 5,2);

        Player Lisa = new Player("Lisa", "Hawkings", 24, 2, 5);
        Player Maria = new Player("Maria", "Mitchells", 23, 4, 3);

        John.printRatio();
        Joe.printRatio();
        Lisa.printRatio();
        Maria.printRatio();

        Team teamRed = new Team("TeamEasy", John, Joe);
        Team teamBlue = new Team("TeamHard", Lisa, Maria);

        teamRed.printAvgAge();
        teamBlue.printAvgAge();

        Match match01 = new Match("Qualifying Match 1", teamRed, teamBlue);

        match01.printMatchAvgAge();

    }

}
