package creditCards.luhnAlgorithim;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LuhnsAlgorithmTest {

    private LuhnsAlgorithm algorithm = new LuhnsAlgorithm();

    @Test
    void testCalculate() {
        String number = "378281";
        int checksum = algorithm.calculate(number);
        Assertions.assertEquals(30, checksum);
    }
    @Test
    void testCalculate2() {
        String number = "49927398716";
        int checksum = algorithm.calculate(number);
        Assertions.assertEquals(70, checksum);
    }


}