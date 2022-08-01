package com.jiqiyi;

import java.util.List;

public class Tiku139 {
    private List<String> wordDict;
    private String s;
    private int[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        this.wordDict = wordDict;
        this.s = s;
        this.memo = new int[s.length()];
        return dfs(0, 0);
    }

    public boolean dfs(int begin,int end){
        if(begin==s.length() || memo[begin]==1) return true;
        else if(end==s.length() || memo[begin]==-1) {
            memo[begin] = -1;
            return false;
        }
        if(wordDict.contains(s.substring(begin,end+1)) && dfs(end+1, end+1)){
            memo[begin] = 1;
            return true;
        }
        else{
            end++;
        }
        return dfs(begin, end);
    }


    /**
     * dynamic plan's solution
     * @param s
     * @param wordDict
     * @return
     */
    public boolean wordBreak2(String s, List<String> wordDict) {
        s += " ";
        int n = s.length();
        boolean[] dp = new boolean[n];
        dp[0] = true;
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(dp[i]) break;
                if(!dp[j]) continue;
                if(dp[j] && wordDict.contains(s.substring(j, i+1))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n-1];
    }
}
