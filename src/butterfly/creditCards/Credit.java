package creditCards;

import creditCards.validators.LuhnValidator;

public class Credit {

    private LuhnValidator luhnValidator = new LuhnValidator();

    public String getType(String cardNumber) {
        if (!luhnValidator.isValid(cardNumber)) {
            return "INVALID";
        }

        return CreditCards.getCreditCard(cardNumber);
    }

}
