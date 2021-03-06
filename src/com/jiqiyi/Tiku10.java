package com.jiqiyi;

public class Tiku10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isMatch(String s, String p) {
		char[] cs = s.toCharArray();
        char[] cp = p.toCharArray();

        boolean[][] dp = new boolean[cs.length + 1][cp.length + 1];

        dp[0][0] = true;
        for (int j = 1; j <= cp.length; j++) {
            if (cp[j - 1] == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= cs.length; i++) {
            for (int j = 1; j <= cp.length; j++) {
                if (cs[i - 1] == cp[j - 1] || cp[j - 1] == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (cp[j - 1] == '*') {
                    if (cs[i - 1] == cp[j - 2] || cp[j - 2] == '.') {
                        dp[i][j] = dp[i][j - 2] 
                                || dp[i - 1][j];
                    } else { 
                        dp[i][j] = dp[i][j - 2];    
                    }
                }
            }
        }
        return dp[cs.length][cp.length];
    }

}
