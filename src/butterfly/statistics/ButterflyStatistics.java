package statistics;

import creditCards.Credit;
import lcdNumbers.PurchaseReader;
import lcdNumbers.purchase.Purchase;

import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ButterflyStatistics {
    private List<Purchase> purchases = new PurchaseReader().read("lcdNumbers/buterfly-business.txt");
    private Credit credit = new Credit();

    public Double getTotalObtainedMoney() {
        return purchases.stream()
                .map(e -> e.getAmountOfPayment())
                .reduce(0.0, (e1, e2) -> e1 + e2);
    }

    public Month getMostProfitableMonth() {
        Optional<Purchase> optionalPurchase = purchases.stream()
                .sorted((e1, e2) -> e2.getAmountOfPayment().compareTo(e1.getAmountOfPayment()))
                .findFirst();
        if (optionalPurchase.isEmpty()) {
            throw new Error("there is no month provided");

        }
        return optionalPurchase.get()
                .getDateOfPayment().getMonth();


    }

    public Map<Month, Double> getAveragePerMonth() {
        return purchases.stream()
                .collect(groupingBy(e -> e.getDateOfPayment().getMonth(),
                        mapping(Purchase::getAmountOfPayment, averagingDouble(Double::valueOf))))
                .entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
    }

    public String getMostUsedCardIssuer() {
        Optional<String> optionalOfMostUsedCard = purchases.stream()
                .map(e -> credit.getType(e.getCreditCardNumber()))
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<String, Long>::getValue).reversed())
                .map(e -> e.getKey())
                .findFirst();
        if (optionalOfMostUsedCard.isEmpty()) {
            throw new Error("no credit cards were provided");
        }
        return optionalOfMostUsedCard.get();
    }
}