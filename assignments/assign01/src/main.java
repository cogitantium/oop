import java.util.Scanner;
import java.lang.String;

public class main {

    public static void main(String[] args) {

        player John = new player("John", "Doe", 20, 3, 1);
        player Joe = new player("Joe", "Smith",21, 5,2);


        System.out.print("Win-loss ratio of " + John.firstName + " " + John.lastName + ": " + John.winLossRatio);

        team team01 = new team(John, Joe);

    }

}
