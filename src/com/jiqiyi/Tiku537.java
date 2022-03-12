package com.jiqiyi;

public class Tiku537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "1+-1i";
		String num2 = "0+0i";
		System.out.println(complexNumberMultiply(num1, num2));
	}
	
	public static String complexNumberMultiply(String num1, String num2) {
		int a = Integer.parseInt(num1.split("[+]")[0]);
		int bMulti = Integer.parseInt(num1.split("[+]")[1].substring(0,num1.split("[+]")[1].length()-1));
		int c = Integer.parseInt(num2.split("[+]")[0]);
		int dMulti = Integer.parseInt(num2.split("[+]")[1].substring(0,num2.split("[+]")[1].length()-1));
		return (a*c-bMulti*dMulti)+"+"+(a*dMulti+bMulti*c)+"i";
    }

}
