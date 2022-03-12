package com.jiqiyi;

public class Tiku747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,20,3,4,5,10};
		System.out.println(dominantIndex(nums));
	}

	public static int dominantIndex(int[] nums) {
        int temp = 0;
        boolean work = false;
        int max_index = 0;
        for(int i=0;i<nums.length;i++)
        {
        	max_index = nums[max_index] > nums[i] ? max_index : i;
        }
		for(int i=0;i<2;i++)
        {
        	for(int j=0;j<nums.length-i-1;j++)
        	{
        		if(nums[j]>nums[j+1])
        		{
        			work = true;
            		temp = nums[j];
            		nums[j] = nums[j+1];
            		nums[j+1] = temp;
        		}
        	}
        	if(!work) 
        	{
        		break;
        	}
        }
        return nums[nums.length-1]>=2*nums[nums.length-2] ? max_index : -1;
    }
}
