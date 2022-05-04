package com.jiqiyi;

class Tiku844 {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='#'){
                if(s1.length()==0) continue;
                s1.deleteCharAt(s1.length()-1);
                continue;
            }
            s1.append(c);
        }
        for(char c:t.toCharArray()){
            if(c=='#'){
                if(s2.length()==0) continue;
                s2.deleteCharAt(s2.length()-1);
                continue;
            }
            s2.append(c);
        }
        return s1.toString().equals(s2.toString());
    }

    /**
     * the second time to practice
     */
    public static boolean backspaceCompare2(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sn = sChars.length;
        int tn = tChars.length;
        int i=sn-1,j=tn-1,skipS=0,skipT=0;
        while(i>=0 || j>=0){
            while(i>=0){
                if(sChars[i]=='#'){
                    skipS++;
                    i--;
                }
                else if(skipS>0){
                    skipS--;
                    i--;
                }else break;
            }
            
            while(j>=0){
                if(tChars[j]=='#'){
                    skipT++;
                    j--;
                }
                else if(skipT>0){
                    skipT--;
                    j--;
                }else break;
            }

            if(i>=0 && j>=0){
                if(sChars[i]!=tChars[j]) return false;
            }else if(i>=0 || j>=0){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        backspaceCompare2(s,t);
    }
}
