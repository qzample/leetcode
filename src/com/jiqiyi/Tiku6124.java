package com.jiqiyi;

public class Tiku6124 {
    int[] dict = new int[26];
    public char repeatedCharacter(String s) {
        char[] cs = s.toCharArray();
        char res = ' ';
        for(char c:cs){
            dict[c-'a']++;
            if(dict[c-'a']==2) {
                res = c;
                break;
            }
        }
        return res;
    }
}
