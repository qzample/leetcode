package com.jiqiyi;

import java.util.HashSet;

class Tiku6051 {
    public int countPrefixes(String[] words, String s) {
        HashSet<String> set = new HashSet<>();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n = chars.length;
        for(int i=0;i<n;i++){
            sb.append(chars[i]);
            set.add(sb.toString());
        }
        int cnt = 0;
        for(String word:words){
            if(set.contains(word)) cnt++;
        }
        return cnt;
    }
}
