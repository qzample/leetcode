package com.jiqiyi;

public class Tiku553 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String optimalDivision(int[] nums) {
		int len = nums.length;
		StringBuilder sb = new StringBuilder();
		if (len==1) return sb.append(nums[0]).toString();
		if(len==2) 	return sb.append(nums[0]).append("/").append(nums[1]).toString();        
        sb.append(nums[0]).append("/(");
        int index = 1;
        while (index < len-1) {
			sb.append(nums[index]).append("/");
			index++;
		}
        sb.append(nums[len-1]).append(")");
        return sb.toString();
    }

}
