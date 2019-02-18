package creditCards.creditCardType;

import creditCards.validators.LengthValidator;
import creditCards.validators.StartsWithValidator;

import java.util.Arrays;

public class VisaElectron extends CreditCard {
    public VisaElectron() {
        super(Arrays.asList(
                new LengthValidator(Arrays.asList("16")),
                new StartsWithValidator(Arrays.asList("4026", "417500", "4508", "4844", "4913", "4917"))
        ));
    }

    @Override
    public String getName() {
        return "Visa Electron";
    }
}
