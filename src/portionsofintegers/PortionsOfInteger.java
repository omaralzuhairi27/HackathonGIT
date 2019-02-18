package portionsOfIntegers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PortionsOfInteger {
    public List<String> partition(int number) {
        return partition(number, number, "");
    }

    public List<String> partition(int number, int max, String prefix) {
        if (number == 0) {
            return Arrays.asList(prefix);
        }
        List<String> partitions = new ArrayList<>();
        IntStream.iterate(Math.min(number, max), i -> i - 1)
                .limit(Math.min(number, max))
                .forEach(e -> {
                    partitions.addAll(partition(number - e, e, prefix + " " + e));
                });
        return partitions;
    }
}
