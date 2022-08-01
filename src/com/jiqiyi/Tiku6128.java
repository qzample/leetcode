package com.jiqiyi;

public class Tiku6128 {
    public String bestHand(int[] ranks, char[] suits) {
        if(isSameSuits(suits)) return "Flush";
        int[] dict = new int[13];
        for(int i=0;i<ranks.length;i++){
            dict[ranks[i]-1]++;
        }
        int max = 0;
        for(int i=0;i<dict.length;i++){
            max = Math.max(max, dict[i]);
        }
        if(max>=3) return "Three of a Kind";
        if(max==2) return "Pair";
        else return "High Card";
    }

    public boolean isSameSuits(char[] suits){
        for(int i=1;i<suits.length;i++){
            if(suits[i]!=suits[i-1]) return false;
        }
        return true;
    }
}
