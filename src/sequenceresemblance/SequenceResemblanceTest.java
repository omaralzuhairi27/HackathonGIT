package sequenceResemblance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SequenceResemblanceTest {
    private SequenceResemblance resemblance = new SequenceResemblance();

    @Test
    void testCalculateSumOfResemblances() {
        long actual = resemblance.calculateSumOfResemblances("ababaa");
        Assertions.assertEquals(11, actual);

        actual = resemblance.calculateSumOfResemblances("aa");
        Assertions.assertEquals(3, actual);

    }

    @Test
    void testCalculateResemblanceValueOf() {
        String word = "ababaa";
        String suffix = "abaa";
        long actual = resemblance.calculateResemblanceValueOf(word, suffix);
        Assertions.assertEquals(3, actual);
    }

    @Test
    void testGetSuffixes() {
        String word = "ababaa";
        List<String> expected = Arrays.asList("ababaa", "babaa", "abaa", "baa", "aa", "a");
        List<String> actual = resemblance.getSuffixes(word);
        Assertions.assertEquals(expected, actual);
    }

}