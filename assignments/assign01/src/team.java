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
        return (player1.age + player2.age) / 2;
    }
}
