package com.jiqiyi;

public class Tiku6133 {
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        int[] dict = new int[100001];
        for(int i=0;i<n;i++){
            dict[grades[i]]++;
        }
        int cnt = 0;
        for(int i=0;i<100001;i++){
            if(dict[i]!=0) cnt++;
        }
        return (int)(Math.sqrt(1+8*cnt)-1)/2;
    }
}
