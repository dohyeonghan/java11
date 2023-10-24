package org.example;

import org.example.strategy.*;

public class Main {
    public static void main(String[] args) {
        Integer integer = 111;
        String text = "hello";

        CorruptedEncodingFinderStrategy notStrategy = new FindNotEBCDICStrategy(integer);
        CorruptedEncodingFinderStrategy invalidStrategy = new FindInvalidEBCDICStrategy(text);

        CorruptedEncodingFinder findNot = new FindNotEBCDICS(notStrategy);
        CorruptedEncodingFinder findInvalid = new FindInvalidEBCDICS(invalidStrategy);

        FindService findService = new FindService(findNot, findInvalid);

        findService.run();
    }
}