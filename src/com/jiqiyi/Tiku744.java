package com.jiqiyi;

public class Tiku744 {
	public static void main(String[] args) {
		char[] letters = {'c','f','j'};
		char target = 'g';
		System.out.println(nextGreatestLetter(letters, target));
	}
	public static char nextGreatestLetter(char[] letters, char target) {
		int n=letters.length;
		int left=0,right=n-1;
		while (left<right) {
			int mid = left+(right-left)/2;
			if (letters[mid] > target) right = mid;
            else left = mid + 1;
		}
		return letters[right] > target ? letters[right] : letters[0];
    }
}
