package com.jiqiyi;

public class Tiku2038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors = "AAABABB";
		winnerOfGame(colors);
	}
	
	public static boolean winnerOfGame(String colors) {
		char[] arr = colors.toCharArray();
		int len = arr.length;
		int ptr1=0,ptr2=0,cntA=0,cntB=0;
		while (ptr2<len) {
			while (ptr2<len && arr[ptr1]==arr[ptr2]) ptr2++;
			if(ptr2-ptr1>=3) {
				if(arr[ptr1]=='A') {
					cntA += ptr2-ptr1-2;
				}
				else {
					cntB += ptr2-ptr1-2;
				}
			}
			ptr1 = ptr2;
			ptr2++;
		}
		return (cntA-cntB) >= 1;
    }

}
