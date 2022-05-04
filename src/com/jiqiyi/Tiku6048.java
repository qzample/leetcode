package com.jiqiyi;

import java.util.HashMap;

class Tiku6048 {
    public int minimumCardPickup(int[] cards) {
        int min = 100010;
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = cards.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(cards[i])){
                int index = map.get(cards[i]);
                int range = i-index+1;
                min = range<min?range:min;
            }
            map.put(cards[i], i);
        }
        return min==100010?-1:min;
    }
}
