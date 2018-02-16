import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class playerTest {
    player player01 = new player("John", "Doe", 24,4,3);
    player player02 = new player("Jane", "Doeline", 20,4,3);

    @Test
    public void calcRatio() {
        assertEquals( (double) (4 / 3), (double) (player01.matchWins / player01.matchLoss) );
    }
}
