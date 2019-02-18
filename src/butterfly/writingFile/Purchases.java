package writingFile;

import creditCards.Credit;
import lcdNumbers.purchase.Purchase;
import lcdNumbers.PurchaseReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Purchases {
    private Credit credit = new Credit();
    private PurchaseReader reader = new PurchaseReader();

    public List<String> getSortedPurchases(String filePath) {
        List<Purchase> purchases = reader.read(filePath);
        return purchases.stream()
                .sorted(Comparator.comparing(e -> e.getDateOfPayment()))
                .map(e -> e.getDateOfPayment() + ","
                        + e.getCreditCardNumber() + ","
                        + credit.getType(e.getCreditCardNumber()) + ","
                        + e.getAmountOfPayment())
                .collect(Collectors.toList());
    }
}
