package com.jiqiyi;

public class Test {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int len = nums.length;
        if(len==0) return;
        for(int i=1;i<len;i++){
            if(nums[i-1]==nums[i]){
                len--;
                for(int j=i;j<len;j++){
                    nums[j] = nums[j+1];
                }
            } 
        }
        
	}
}
