package org.example.strategy;

public class FindService {
    private final CorruptedEncodingFinder findNotEBCDICS;
    private final CorruptedEncodingFinder findInvalidEBCDICS;


    public FindService(CorruptedEncodingFinder findNotEBCDICS, CorruptedEncodingFinder findInvalidEBCDICS) {
        this.findNotEBCDICS = findNotEBCDICS;
        this.findInvalidEBCDICS = findInvalidEBCDICS;
    }

    public void run(){
        findNotEBCDICS.find();
        findInvalidEBCDICS.find();
    }


}
