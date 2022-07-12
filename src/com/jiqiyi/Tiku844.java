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





    /**
     * the third time to practice
     * @param s
     * @param t
     * @return
     */
    public boolean backspaceCompare3(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int ptr1 = sChars.length-1,ptr2=tChars.length-1;
        int hashCnt1 = 0,hashCnt2=0;
        while(ptr1>=0 || ptr2>=0){
            while(ptr1>=0){
                if(sChars[ptr1]=='#'){
                    hashCnt1++;
                    ptr1--;
                }
                else if(hashCnt1>0){
                    hashCnt1--;
                    ptr1--;
                }
                else break;
            }
            while(ptr2>=0){
                if(tChars[ptr2]=='#'){
                    hashCnt2++;
                    ptr2--;
                }
                else if(hashCnt2>0){
                    hashCnt2--;
                    ptr2--;
                }
                else break;
            }
            if(ptr1>=0 && ptr2>=0){
                if(sChars[ptr1]!=tChars[ptr2]) return false;
            }
            else if(ptr1>=0 || ptr2>=0) return false;
            ptr1--;
            ptr2--;
        }
        return true;
    }
}
