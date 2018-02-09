public class player {
    public player(String firstName, String lastName, int age, int matchWins, int matchLoss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.matchWins = matchWins;
        this.matchLoss = matchLoss;
        this.winLossRatio = calcRatio();
    }

    String firstName;
    String lastName;
    String sponsor;
    int age;
    int matchWins;
    int matchLoss;
    double winLossRatio;

    double calcRatio() {
        return matchWins / matchLoss;
    }

}



