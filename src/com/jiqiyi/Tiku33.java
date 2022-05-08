package com.jiqiyi;

public class Tiku33 {
	
	public int search(int[] nums, int target) {
		int n = nums.length;
		int left=0,right=n-1;
		while(left<right) {
			int mid = left+(right-left)/2;
			// 左边有序
			if(nums[0]<nums[mid]){
				if(target>nums[0] && target<nums[mid]){
					right = mid;
				}
				else{
					left = mid+1;
				}
			}
			// 右边有序
			else{
				if(target>nums[mid] && target<nums[n-1]){
					left = mid + 1;
				}
				else{
					right = mid;
				}
			}
		}
		return nums[left]==target?left:-1;
    }



	/**
	 * the second time to practice
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search2(int[] nums, int target) {
		int n = nums.length;
		int l=0,r=n-1,m;
		while(l<r){
			m = l + (r-l)/2;
			if(nums[0]<nums[m]){
				if(nums[0]>target){
					l = m + 1;
				}
				else{
					r = m;
				}
			}
			else{
				if(nums[m]>=target){
					r = m;
				}
				else{
					l = m + 1;
				}
			}
		}
		if(nums[l]!=target) return -1;
		return l;
    }

	/**
	 * the third time to practice
	 * simple solution
	 * firstly,find the rotation point idx
	 * secondly,use the binary search to search [0,idx]
	 * if the second step's result is -1
	 * the use the binary search to search [idx,n-1]
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search3(int[] nums, int target) {
		int n = nums.length;
		int idx = 0;
		for(int i=0;i<n-1;i++){
			if(nums[i]>nums[i+1]){
				idx = i + 1;
			}
		}
		int res = binarySearch(nums, 0, idx, target);
		if(res!=-1) return res;
		return binarySearch(nums, idx+1, n-1, target);
	}

	/**
	 * 
	 * @param nums
	 * @param begin
	 * @param end
	 * @param target
	 * @return
	 */
	public int binarySearch(int[] nums,int left,int right,int target){
		int mid = left + (right - left)/2;
		while(left<right){
			mid = left + (right-left)/2;
			if(nums[mid]<target){
				left = mid + 1;
			}
			else{
				right = mid;
			}
		}
		return nums[left]==target?left:-1;
	}

	/**
	 * firstly use the binary search to find the rotation point 
	 * secondly determine target is in which section
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search4(int[] nums, int target) {
		int n = nums.length;
		int left=0,right=n-1,mid;
		while(left<right){
			mid = left + (right-left)/2;
			if(nums[mid]<nums[0]){
				left = mid + 1;
			}
			else{
				right = mid;
			}
		}
		if(target>=nums[0]){
			left = 0;
		}
		else{
			left = left + 1;
			right = n - 1;
		}
		while(left<right){
			mid = left + (right - left)/2;
			if(nums[mid]<target){
				left = mid + 1;
			}
			else{
				right = mid;
			}
		}
		return nums[left]==target?left:-1;
	}
    
}
