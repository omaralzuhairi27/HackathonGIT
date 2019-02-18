package writingFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WritingFile {

    public static void main(String[] args) {
        List<String> headers = Arrays.asList("Date Of Payment,The Credit Card Number,The Credit Card Issuer,The Amount Of Payment");
        List<String> sortedPurchases = new Purchases().getSortedPurchases("lcdNumbers/buterfly-business.txt");
        write(headers, "Purchases.csv");
        append(sortedPurchases, "Purchases.csv");
    }

    public static void write(List<String> lines, String filePath) {
        try {
            Path path = Paths.get(filePath);
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void append(List<String> lines, String filePath) {
        try {
            Path path = Paths.get(filePath);
            Files.write(path, lines, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
