package com.jiqiyi;

class Tiku6047 {
    public String removeDigit(String number, char digit) {
        char[] chars = number.toCharArray();
        int n = chars.length;
        int index=number.lastIndexOf(digit);
        for(int i=0;i<n;i++){
            if(chars[i]!=digit) continue;
            if(i==n-1){
                index=i;
                break;
            }
            else if(chars[i]<chars[i+1]){
                index=i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder(number);
        sb.deleteCharAt(index);
        return sb.toString();
    }
}
