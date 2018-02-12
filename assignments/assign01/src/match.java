public class match {
    String matchName;
    team team01;
    team team02;
    double matchAvgAge;

    public match(String matchName, team team01, team team02) {
        this.matchName = matchName;
        this.team01 = team01;
        this.team02 = team02;
        this.matchAvgAge = calcMatchAvgAge();
    }

    double calcMatchAvgAge() {
        return (team01.avgAge + team02.avgAge) / 2;
    }

    void printMatchAvgAge() {
        System.out.println(matchName + " average age of match participants is: " + matchAvgAge);
    }
}
