package com.jiqiyi;

public class Tiku201 {
    public int rangeBitwiseAnd(int left, int right) {
        while(left<right){
            right = right & (right-1);
        }
        return right;
    }
}
