package exercises0.assignment;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    Player player01 = new Player("John", "Doe", 24,4,3);
    Player player02 = new Player("Jane", "Doeline", 20,4,3);

    @Test
    public void calcRatio() {
        assertEquals( (double) (4 / 3), (double) (player01.matchWins / player01.matchLoss) );
    }
}
