package exercises0.assignment;

public class Player {
    String firstName;
    String lastName;
    String sponsor;
    int age;
    int matchWins;
    int matchLoss;
    double winLossRatio;

    public Player(String firstName, String lastName, int age, int matchWins, int matchLoss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.matchWins = matchWins;
        this.matchLoss = matchLoss;
        this.winLossRatio = calcRatio();
    }

    double calcRatio() {
        //typecasting necessary
        return (double) matchWins / matchLoss;
    }

    void printRatio() {
        System.out.println("Win-loss ratio of " + firstName + " " + lastName + ": " + winLossRatio);
    }
}
