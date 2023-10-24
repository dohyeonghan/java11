package org.example.strategy;

public class FindNotEBCDICStrategy implements CorruptedEncodingFinderStrategy{
    private final Integer integer;

    public FindNotEBCDICStrategy(Integer integer) {
        this.integer = integer;
    }

    @Override
    public void find() {
        System.out.println(integer);
    }
}
