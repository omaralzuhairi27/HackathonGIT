package sequenceResemblance;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceResemblance {
    public long calculateSumOfResemblances(String word) {
        return getSuffixes(word).stream()
                .map(suffix -> (int) calculateResemblanceValueOf(word, suffix))
                .mapToInt(Integer::intValue)
                .sum();
    }

    long calculateResemblanceValueOf(String word, String suffix) {
        return IntStream.iterate(0, n -> n + 1)
                .limit(suffix.length())
                .takeWhile(position -> word.charAt(position) == suffix.charAt(position))
                .count();
    }

     List<String> getSuffixes(String word) {
        return IntStream.iterate(0, n -> n + 1)
                .boxed()
                .limit(word.length())
                .map(position -> word.substring(position))
                .collect(Collectors.toList());
    }
}