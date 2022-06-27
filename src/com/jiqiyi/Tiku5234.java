package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Tiku5234 {
    int[] dic = new int[26];
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        int n = words.length;
        if(n==1){
            res.add(words[0]);
            return res;
        }
        int i=0,j=1;
        while(i<n){
            while(j<n && isAnagram(words[j], words[i])) j++;
            res.add(words[i]);
            i=j;
            j++;
        }
        return res;
    }
    public boolean isAnagram(String str1,String str2){
        Arrays.fill(dic, 0);
        if(str1.length() != str2.length()) return false;
        for(int i=0;i<str1.length();i++){
            dic[str1.charAt(i)-'a']++;
            dic[str2.charAt(i)-'a']--;
        }
        return Arrays.equals(dic, new int[26]);
    }
}
