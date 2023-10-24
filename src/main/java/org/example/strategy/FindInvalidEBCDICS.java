package org.example.strategy;

public class FindInvalidEBCDICS implements CorruptedEncodingFinder{
    private final CorruptedEncodingFinderStrategy strategy;

    public FindInvalidEBCDICS(CorruptedEncodingFinderStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void find() {
        strategy.find();
    }
}
