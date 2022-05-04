package com.jiqiyi;
import java.util.ArrayList;

class Tiku6062 {
    
}
class ATM {
    private int[] backnotesCount;
    public ATM() {
        backnotesCount = new int[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++){
            this.backnotesCount[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int fifveHundred = amount/500;        
        int twoHundred = (amount%500)/200;
        int oneHundred = ((amount%500)%200)/100;
        int fifty = (((amount%500)%200)%100)/50;
        int twenty = ((((amount%500)%200)%100)%50)/20;
        if(((((amount%500)%200)%100)%50)%20!=0) return new int[]{-1};
        if(backnotesCount[0]<twenty || backnotesCount[1]<fifty || backnotesCount[2]<oneHundred || backnotesCount[3]<twoHundred || backnotesCount[4]<fifveHundred) return new int[]{-1};
        backnotesCount[0] -= twenty;
        backnotesCount[1] -= fifty;
        backnotesCount[2] -= oneHundred;
        backnotesCount[3] -= twoHundred;
        backnotesCount[4] -= fifveHundred;
        return new int[]{twenty,fifty,oneHundred,twoHundred,fifveHundred};
    }
}
