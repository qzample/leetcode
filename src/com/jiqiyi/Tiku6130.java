package com.jiqiyi;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tiku6130 {
    
}

class NumberContainers {
    /**
     * key: index
     * value: val
     */
    private HashMap<Integer,Integer> indexMap;
    // private TreeMap valMap;
    public NumberContainers() {
        indexMap = new HashMap<>();
        // valMap = 
    }
    
    public void change(int index, int number) {
        indexMap.put(index, number);
        // valMap.get(key)
    }
    
    public int find(int number) {
        return 0;
    }
}
