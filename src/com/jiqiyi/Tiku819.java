package com.jiqiyi;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Tiku819{
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord1(paragraph, banned));
    }

    /**
     * regex solution is not work in leetcode
     * @param paragraph
     * @param banned
     * @return
     */
    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String pattern = "[^a-z]";
        Pattern regex = Pattern.compile(pattern);
        //Matcher matcher = regex.matcher(paragraph);
        String[] words = regex.split(paragraph);
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(String word:banned){
            map.remove(word);
        }
        String result = "";
        int max=0;
        Set<String> keySet = map.keySet();
        for(String key:keySet){
            if(map.get(key)>max){
                result = key;
                max = map.get(key);
            }
        }
        return result;
    }

    public static String mostCommonWord1(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for(String str:banned) set.add(str);
        char[] words = paragraph.toCharArray();
        HashMap<String,Integer> map = new HashMap<>();
        String ans = null;
        int n = words.length;
        for(int i=0,j=0;i<n;i=j+1){
            while(i<n && !Character.isLetter(words[i])) i++;
            j=i;
            while(j<n && Character.isLetter(words[j])) j++;
            String sub = paragraph.substring(i, j).toLowerCase();
            if(set.contains(sub)) continue;
            map.put(sub,map.getOrDefault(sub,0)+1);
            if(ans==null || map.get(ans)<map.get(sub)) ans = sub;
        }
        return ans;
    }
}