package org.example.strategy;

public class FindNotEBCDICS implements CorruptedEncodingFinder{
    private final CorruptedEncodingFinderStrategy strategy;

    public FindNotEBCDICS(CorruptedEncodingFinderStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void find() {
        strategy.find();
    }
}
