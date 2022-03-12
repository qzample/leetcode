package com.jiqiyi;

public class Tiku540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3,7,7,10,11,11};
		System.out.println(singleNonDuplicate(nums));
	}
	
	public int singleNonDuplicate1(int[] nums) {
		int len = nums.length;
		for(int i=0;i<len;i+=2)
		{
			if(nums[i]!=nums[i+1])
			{
				return nums[i];
			}
		}
		return nums[len-1];
    }

	public static int singleNonDuplicate2(int[] nums) {
		int len = nums.length;
		int left = 0;
		int right = len - 1;
		int mid;
		while(left<right)
		{
			mid = (left+right)/2;
			if(mid%2==0)
			{
				if(mid+1<len && nums[mid] == nums[mid+1]) left=mid+1;
				else right=mid;
			}
			else {
				if(mid-1 >=0 && nums[mid-1] == nums[mid]) left=mid+1;
				else right=mid;
			}
		}
		return nums[left];
	}
	
	public static int singleNonDuplicate(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int mid;
		while(left<right)
		{
			mid = (left+right)/2;
			if(nums[mid] == nums[mid^1]) left = mid+1;
			else right=mid;
		}
		return nums[left];
	}
}
