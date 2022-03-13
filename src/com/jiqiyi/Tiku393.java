package com.jiqiyi;

public class Tiku393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean validUtf8(int[] data) {		
		int len = data.length;		
		for(int i=0;i<len;) {
			int cur = data[i],j=7;
			while (j>0 && (cur >> j & 1)!=0) {
				j--;
			}
			int cnt = 7-j;
			if(cnt == 1 || cnt > 4) return false;
			for(int k=i+1;k<i+cnt;k++) {
				if((data[k] >> 7 & 1)!=1 || (data[k] >> 6 & 1)!=0 ) {
					return false;
				}
			}
			if(cnt==0) i++;
			else {
				i+=cnt;
			}
		}
		return true;
    }

}
