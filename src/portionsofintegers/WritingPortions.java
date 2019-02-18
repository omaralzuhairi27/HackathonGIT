package portionsOfIntegers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WritingPortions {
    private static PortionsOfInteger portionsOfInteger = new PortionsOfInteger();

    public static void main(String[] args) {
        List<String> portionsOfTen = portionsOfInteger.partition(10);
        write(new ArrayList<>(),"PortionsOfTen.txt");
        append(portionsOfTen,"PortionsOfTen.txt");

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
