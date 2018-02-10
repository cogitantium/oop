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

public class main {

    public static void main(String[] args) {

        player John = new player("John", "Doe", 20, 4, 3);
        player Joe = new player("Joe", "Smith",22, 5,2);

        player Lisa = new player("Lisa", "Hawkings", 24, 2, 5);
        player Maria = new player("Maria", "Mitchells", 23, 4, 3);

        Lisa.printRatio();

        System.out.println("Win-loss ratio of " + John.firstName + " " + John.lastName + ": " + John.winLossRatio);

        team team01 = new team("TeamEasy", John, Joe);
        team team02 = new team("TeamHard", Lisa, Maria);

        System.out.println("Average age of " + team01.teamName + " is: " + team01.avgAge);

    }

}
