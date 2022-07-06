package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tiku15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}
	
	public static List<List<Integer>> threeSum1(int[] nums) {
		int len = nums.length;
		int target;
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<len-1;i++) {
			target = -nums[i];
			int head=i+1,tail=len-1;
			list.clear();
			while (head<tail) {
				if(nums[head]+nums[tail]==target) {
					list.add(nums[head]);
					list.add(nums[i]);
					list.add(nums[tail]);
					res.add(new ArrayList<Integer>(list));
					break;
				}
				else if(nums[head]+nums[tail]<target) {
					head++;
				}
				else if(nums[head]+nums[tail]>target) {
					tail--;
				}
			}
		}
		return res;
    }
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int len = nums.length;
		Arrays.sort(nums);
		for(int i=0;i<len-2;i++) {
			if(i>0 && nums[i]==nums[i-1]) continue;
			if(nums[i]>0) break;
			int left = i+1,right = len-1;
			int target = -nums[i];
			while(left<right) {
				if(nums[left]+nums[right]==target) {
					res.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while (left<right && nums[left]==nums[left+1]) left++;
					while(left<right && nums[right]==nums[right-1]) right--;
					left++;
					right--;
				}
				else if(nums[left]+nums[right]<target) {
					left++;
				}
				else {
					right--;
				}
			}
		}
		return res;
	}

	/**
	 * the second time to practice
	 */
	public List<List<Integer>> threeSum2(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for(int i=0,j,k,target;i<n;i++){
			if(nums[i]>0) break;
			if(i>0 && nums[i]==nums[i-1]) continue;
			j=i+1;
			k=n-1;
			target=-nums[i];
			while(j<k){
				if(nums[j]+nums[k]<target){
					j++;
				}
				else if(nums[j]+nums[k]==target){
					res.add(Arrays.asList(nums[i],nums[j],nums[k]));
					while(j<k && nums[j]==nums[j+1]) j++;
					while(j<k && nums[k]==nums[k-1]) k--;
					j++;
					k--;
				}
				else{
					k--;
				}
			}
		}
		return res;
    }


	/**
	 * the third time to practice
	 */
	public List<List<Integer>> threeSum3(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for(int i=0;i<n;){
			int target = -nums[i];
			int j=i+1,k=n-1;
			while(j<k){
				if(nums[j]+nums[k]<target){
					j++;
				}
				else if(nums[j]+nums[k]==target){
					res.add(Arrays.asList(nums[i],nums[j],nums[k]));
					int tmp = nums[k];
					while(k>j && nums[k]==tmp) k--;
					tmp = nums[j];
					while(j<k && nums[j]==tmp) j++;
				}
				else{
					k--;
				}
			}
			int tmp = nums[i];
			while(i<n && nums[i]==tmp) i++;
			if(i==n) break;
		}
		return res;
    }

	/**
	 * the fourth time to practice
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> threeSum4(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		int n = nums.length;
		Arrays.sort(nums);
		for(int i=0;i<n;){
			int j=i+1,k=n-1;
			int target = -nums[i];
			int tmp;
			while(j<k){
				if(nums[j]+nums[k]<target){
					j++;
				}
				else if(nums[j]+nums[k]==target){
					res.add(Arrays.asList(nums[i],nums[j],nums[k]));
					tmp = nums[k];
					while(k>j && nums[k]==tmp) k--;
					tmp = nums[j];
					while(j<k && nums[j]==tmp) j++;
				}
				else{
					k--;
				}
			}
			tmp = nums[i];
			while(i<n && nums[i]==tmp) i++;
		}
		return res;
    }
}
