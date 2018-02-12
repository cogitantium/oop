public class team {
    String teamName;
    player player1;
    player player2;
    double avgAge;

    public team(String teamName, player player1, player player2) {
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
