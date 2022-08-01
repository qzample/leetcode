package com.jiqiyi;

public class Tiku583 {
    public int minDistance(String word1, String word2) {
        word1 = " " + word1;
        word2 = " " + word2;
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1][len2];
        for(int i=0;i<len1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<len2;j++){
            dp[0][j] = 0;
        }
        for(int i=1;i<len1;i++){
            for(int j=1;j<len2;j++){
                if(word1.charAt(i)==word2.charAt(j)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        for(int i=1;i<len1;i++){
            for(int j=1;j<len2;j++){
                System.out.println(dp[i][j]);
            }
            System.out.println("\t");
        }
        return len1 + len2 - 2*dp[len1-1][len2-1];
    }
}
