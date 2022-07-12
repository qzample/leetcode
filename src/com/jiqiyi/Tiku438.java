package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Tiku438 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        findAnagrams(s,p);
        findAnagrams(s, p);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int sn = s.length();
        int pn = p.length();
        int[] sWords = new int[26];
        int[] pWords = new int[26];
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<pn;i++){
            pWords[pChars[i]-'a']++;
            sWords[sChars[i]-'a']++;
        }
        if(Arrays.equals(sWords, pWords)){
            res.add(0);
        }
        for(int i=pn;i<sn;i++){
            sWords[sChars[i-pn]-'a']--;
            sWords[sChars[i]-'a']++;
            if(Arrays.equals(sWords, pWords)){
                res.add(i-pn+1);
            }
        }
        return res;
    }


    /**
     * the second time to practice
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams2(String s, String p) {
        int[] sDict = new int[26];
        int[] pDict = new int[26];
        char[] sChars = s.toCharArray();
        char[] pChars = p.toCharArray();
        int sLen = sChars.length;
        int pLen = pChars.length;
        List<Integer> res = new ArrayList<>();
        if(sLen<pLen) return res;
        for(int i=0;i<pLen;i++){
            sDict[sChars[i]-'a']++;
            pDict[pChars[i]-'a']++;
        }
        if(Arrays.equals(sDict, pDict)){
            res.add(0);
        }
        for(int i=pLen;i<sLen;i++){
            sDict[sChars[i-pLen]-'a']--;
            sDict[sChars[i]-'a']++;
            if(Arrays.equals(sDict, pDict)){
                res.add(i-pLen+1);
            }
        }
        return res;
    }
}
