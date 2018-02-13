import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class player {
    String firstName;
    String lastName;
    String sponsor;
    int age;
    int matchWins;
    int matchLoss;
    double winLossRatio;

    public player(String firstName, String lastName, int age, int matchWins, int matchLoss) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.matchWins = matchWins;
        this.matchLoss = matchLoss;
        this.winLossRatio = calcRatio();
    }

    @Test
    void testCalcRatio() {
        player testPlayer01 = new player("Name", "Name", 22,4,3);
        assertEquals(testPlayer01.calcRatio(), (4 / 3));
    }

    double calcRatio() {
        //typecasting necessary
        return (double) matchWins / matchLoss;
    }

    void printRatio() {
        System.out.println("Win-loss ratio of " + firstName + " " + lastName + ": " + winLossRatio);
    }

}
