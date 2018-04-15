package exercises0.assignment;

public class Match {
    String matchName;
    Team team01;
    Team team02;
    double matchAvgAge;

    public Match(String matchName, Team team01, Team team02) {
        this.matchName = matchName;
        this.team01 = team01;
        this.team02 = team02;
        this.matchAvgAge = calcMatchAvgAge();
    }

    double calcMatchAvgAge() {
        return (team01.avgAge + team02.avgAge) / 2;
    }

    void printMatchAvgAge() {
        System.out.println(matchName + " average age of Match participants is: " + matchAvgAge);
    }
}
