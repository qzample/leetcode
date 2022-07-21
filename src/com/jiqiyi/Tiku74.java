package com.jiqiyi;

public class Tiku74 {
	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix2(matrix, 3));
	}
	public static boolean searchMatrix1(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int row=0;
		// confirm that the number is in which row
		for(int i=0;i<m;i++) {
			if(matrix[i][0]<=target) row=i;
			else break;
		}
		// traverse the row use binary search
		int[] nums = matrix[row];
		int left=0,right=n-1;
		while (left<right) {
			int mid = left+(right-left)/2;
			if(nums[mid]==target) {
				return true;
			}
			else if(nums[mid]<target) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		return false;
    }


	/**
	 * the second time to practice
	 * @param matrix
	 * @param target
	 * @return
	 */
	public static boolean searchMatrix2(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		if(target<matrix[0][0]) return false;
		int left=0,right=m-1,mid;
		while(left<right){
			mid = left + (right-left)/2;
			if(matrix[mid][0]<target){
				left = mid;
			}
			else if(matrix[mid][0]>target){
				right = mid;
			}
		}
		int row = left;
		left = 0;
		right = n-1;
		while(left<right){
			mid = left + (right-left)/2;
			if(matrix[row][mid]<target){
				left = mid + 1;
			}
			else{
				right = mid;
			}
		}
		return matrix[row][left]==target;
    }


	/**
	 * the third time to practice
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int left=0,right=m-1,mid;
		while(left<right){
			mid = left + (right-left)/2;
			if(matrix[mid][0]<target){
				left = mid + 1;
			}
			else{
				right = mid;
			}
		}
		return false;
	}
}
