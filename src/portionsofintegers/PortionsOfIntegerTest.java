package portionsOfIntegers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PortionsOfIntegerTest {
    private PortionsOfInteger portionsOfInteger = new PortionsOfInteger();

    @Test
    void testPortions() {
        String actual = portionsOfInteger.partition(10).stream()
                .map(e->e.trim())
                .collect(Collectors.joining("\n"));
        String expected = "10\n" +
                "9 1\n" +
                "8 2\n" +
                "8 1 1\n" +
                "7 3\n" +
                "7 2 1\n" +
                "7 1 1 1\n" +
                "6 4\n" +
                "6 3 1\n" +
                "6 2 2\n" +
                "6 2 1 1\n" +
                "6 1 1 1 1\n" +
                "5 5\n" +
                "5 4 1\n" +
                "5 3 2\n" +
                "5 3 1 1\n" +
                "5 2 2 1\n" +
                "5 2 1 1 1\n" +
                "5 1 1 1 1 1\n" +
                "4 4 2\n" +
                "4 4 1 1\n" +
                "4 3 3\n" +
                "4 3 2 1\n" +
                "4 3 1 1 1\n" +
                "4 2 2 2\n" +
                "4 2 2 1 1\n" +
                "4 2 1 1 1 1\n" +
                "4 1 1 1 1 1 1\n" +
                "3 3 3 1\n" +
                "3 3 2 2\n" +
                "3 3 2 1 1\n" +
                "3 3 1 1 1 1\n" +
                "3 2 2 2 1\n" +
                "3 2 2 1 1 1\n" +
                "3 2 1 1 1 1 1\n" +
                "3 1 1 1 1 1 1 1\n" +
                "2 2 2 2 2\n" +
                "2 2 2 2 1 1\n" +
                "2 2 2 1 1 1 1\n" +
                "2 2 1 1 1 1 1 1\n" +
                "2 1 1 1 1 1 1 1 1\n" +
                "1 1 1 1 1 1 1 1 1 1";
        Assertions.assertEquals(expected,actual);
    }

}