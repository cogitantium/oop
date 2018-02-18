import org.junit.jupiter.api.test;

import static org.junit.jupiter.api.Assertions.*;

public class bankAccountTest {

    @Test
    void bankDepositTest() {
        bankAccount testAcc = new bankAccount(10000, 0.04, 0.06);
        assertTrue(testAcc.deposit(1000));
    }
}
