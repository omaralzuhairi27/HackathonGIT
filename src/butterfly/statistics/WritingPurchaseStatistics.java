package statistics;

import writingFile.WritingFile;

import java.util.ArrayList;
import java.util.List;

public class WritingPurchaseStatistics {
    private static ButterflyStatistics statistics = new ButterflyStatistics();

    public static void main(String[] args) {
        List<String> statisticalInformation = getInformationAsList();
        WritingFile.write(new ArrayList<>(), "PurchaseStatistics.csv");
        WritingFile.append(statisticalInformation, "PurchaseStatistics.csv");

    }

    private static List<String> getInformationAsList() {
        List<String> statisticalInformation = new ArrayList<>();
        statisticalInformation.add("Total amount of money:");
        statisticalInformation.add(statistics.getTotalObtainedMoney().toString());
        statisticalInformation.add("The most profitable month:");
        statisticalInformation.add(statistics.getMostProfitableMonth().toString());
        statisticalInformation.add("The most used credit card issuer:");
        statisticalInformation.add(statistics.getMostUsedCardIssuer());
        statisticalInformation.add("The average per month:");
        statisticalInformation.add(statistics.getAveragePerMonth().toString());
        return statisticalInformation;
    }
}
