package com.jiqiyi;

public class Tiku67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		char[] aChars = a.toCharArray();
		char[] bChars = b.toCharArray();
		int lena = aChars.length;
		int lenb = bChars.length;
		int index = 1;
		int carry = 0,sum;
		while (lena-index>=0 && lenb-index>=0) {
			sum = carry + aChars[lena-index]-'0' + bChars[lenb-index]-'0';
			sb.append(sum%2);
			carry = sum/2;
			index++;
		}
		while (index<=lena) {
			sum = carry+aChars[lena-index] - '0';
			carry = sum/2;
			sb.append(sum%2);
		}
		while (index<=lenb) {
			sum = carry+bChars[lenb-index] - '0';
			carry = sum/2;
			sb.append(sum%2);
		}
		if(carry!=0) sb.append(carry);
		return sb.reverse().toString();
    }

}
