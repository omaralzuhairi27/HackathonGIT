package creditCards.creditCardType;

import creditCards.Credit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CreditTest {

    private Credit credit = new Credit();


    @ParameterizedTest
    @CsvSource({
            "378282246310005, American Express",
            "5555555555554444, MasterCard",
            "4222222222222, Visa",
            "6011583102250437, Discover",
            "6759671871310254, Maestro",
            "4913589005620679, Visa Electron",
            "6388223819764850, Insta Payment",
            "2223016768739314, INVALID",
            "3530111333300000, UNKNOWN",

    })
    void testWithCsvSource(String cardNumber, String expectedCardName) {

        String actualCardName = credit.getType(cardNumber);
        Assertions.assertEquals(expectedCardName, actualCardName);
    }
}