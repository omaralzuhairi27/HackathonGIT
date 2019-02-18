package portionsOfIntegers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Portions {
    private PortionsOfInteger portionsOfInteger = new PortionsOfInteger();

    public List<List<Integer>> getPortions(int number) {
        List<String> portions = portionsOfInteger.partition(number);
        return portions.stream()
                .map(string -> Stream.of(string.split(" "))
                        .filter(e->!e.equals(""))
                        .map(Integer::valueOf)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

}
