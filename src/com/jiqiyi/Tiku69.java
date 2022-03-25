package com.jiqiyi;

public class Tiku69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySqrt(2147395599);
	}
	
	public static int mySqrt(int x) {
		int left = 0,right = x;
		int mid = 0;
        int ans = -1;
		while (left<=right) {
            mid = left + (right-left) / 2;
			if(x/mid>=mid) {
                ans = mid;
				left = mid+1;
			}
			else {
                right = mid-1;
			}
		}
		return ans;
    }

}
