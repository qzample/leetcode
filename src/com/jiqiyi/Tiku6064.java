package com.jiqiyi;

import java.util.Arrays;

class Tiku6064 {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int i=bottom;
        int max = 0;
        Arrays.sort(special);
        for(int j=0;j<special.length;j++){
            int range = special[j]-i;
            max = range>max?range:max;
            i = special[j]+1;
        }
        i = top;
        for(int j=special.length-1;j>=0;j--){
            int range = i-special[j];
            max = range>max?range:max;
            i = special[j]-1;
        }
        return max;
    }
}
