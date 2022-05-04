package com.jiqiyi;

import java.util.Arrays;

class Tiku821 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        shortestToChar(s, c);
    }
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] left = new int[n];
        int[] right = new int[n];
        char[] arr = s.toCharArray();
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);
        for(int i=0;i<n;i++){
            if(arr[i]==c){
                left[i]=0;
            }
            else if(i>0 && (left[i-1]>=0)){
                left[i]=left[i-1]+1;
            }

            if(arr[n-i-1]==c){
                right[n-i-1]=0;
            }
            else if(i>0 && (right[n-i]>=0)){
                right[n-i-1]=right[n-i]+1;
            }
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(left[i]<0) res[i]=right[i];
            else if(right[i]<0) res[i]=left[i];
            else{
                res[i] = Math.min(left[i], right[i]);
            }
        }
        return res;
    }
}
