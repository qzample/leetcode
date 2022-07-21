package com.jiqiyi;

public class Tiku91 {
    /**
     * the first time to practice
     * @param s
     * @return
     */
    public static int numDecodings(String s) {
        if(s==null || s.length()==0) return 0;
        char[] sChars = s.toCharArray();
        int n = sChars.length;
        int begin = 0;
        while(begin<n && sChars[begin]=='0') begin++;
        if(begin==n) return 0;
        int pre = 0;
        begin++;
        for(;begin<n;begin++){
            pre = pre + decodeNum(begin,sChars);
        }
        return pre;
    }

    public static int decodeNum(int begin,char[] sChars){
        if(sChars[begin-1]=='0' && sChars[begin]=='0') return 0;
        else if(sChars[begin-1]=='0') return 1;
        else if(sChars[begin]=='0'){
            if(sChars[begin-1]-'0'<=2) return 1;
            else return 0;
        }
        else{
            if(Integer.parseInt(String.valueOf(sChars[begin-1])+String.valueOf(sChars[begin]))<=26) {
                return 2;
            }
            else{
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        numDecodings("226");
    }
}
