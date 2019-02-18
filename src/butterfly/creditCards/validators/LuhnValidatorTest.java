package creditCards.validators;

import creditCards.validators.LuhnValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LuhnValidatorTest {

    private LuhnValidator validator = new LuhnValidator();


    @ParameterizedTest
    @CsvSource({
            "378282246310005, true",
            "378282346310005, false",
            "371847579533915, true",
            "5114266492307268, true",
            "4417123456789113, true",

    })
    void testWithCsvSource(String cardNumber, boolean expectedValidity) {
        boolean actualValidity = validator.isValid(cardNumber);
        Assertions.assertEquals(expectedValidity, actualValidity);
    }
}