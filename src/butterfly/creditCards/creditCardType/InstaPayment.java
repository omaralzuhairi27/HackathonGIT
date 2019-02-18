package creditCards.creditCardType;

import creditCards.creditCardType.CreditCard;
import creditCards.validators.LengthValidator;
import creditCards.validators.StartsWithValidator;

import java.util.Arrays;

public class InstaPayment extends CreditCard {
    public InstaPayment() {
        super(Arrays.asList(
                new LengthValidator(Arrays.asList("16")),
                new StartsWithValidator(Arrays.asList("637", "638", "639"))
        ));
    }

    @Override
    public String getName() {
        return "Insta Payment";
    }
}
