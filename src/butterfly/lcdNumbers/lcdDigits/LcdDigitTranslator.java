package lcdNumbers.lcdDigits;

import lcdNumbers.dictionary.Dictionary;

public class LcdDigitTranslator {

    private Dictionary dictionary = new Dictionary();

    public String toRealDigit(LcdDigit lcdDigit) {
        return dictionary.valuesOfLcds().get(lcdDigit);
    }
}