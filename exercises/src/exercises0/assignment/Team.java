package exercises0.assignment;

public class Team {
    String teamName;
    Player player1;
    Player player2;
    double avgAge;

    public Team(String teamName, Player player1, Player player2) {
        this.teamName = teamName;
        this.player1 = player1;
        this.player2 = player2;
        this.avgAge = calcAvgAge();
    }

    double calcAvgAge() {
        return (double) (player1.age + player2.age) / 2;
    }

    void printAvgAge() {
        System.out.println(teamName + " average age is: " + avgAge);
    }
}
