package creditCards.creditCardType;

import creditCards.validators.LengthValidator;
import creditCards.validators.StartsWithValidator;

import java.util.Arrays;

public class Visa extends CreditCard {

    public Visa() {
        super(Arrays.asList(
                new LengthValidator(Arrays.asList("13", "16","19")),
                new StartsWithValidator(Arrays.asList("4"))
        ));
    }

    @Override
    public String getName() {
        return "Visa";
    }

}
