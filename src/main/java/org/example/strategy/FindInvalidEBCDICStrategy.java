package org.example.strategy;

public class FindInvalidEBCDICStrategy implements CorruptedEncodingFinderStrategy{
    private final String text;

    public FindInvalidEBCDICStrategy(String text) {
        this.text = text;
    }

    @Override
    public void find() {
        // TODO document why this method is empty
        System.out.println(text);
    }
}
