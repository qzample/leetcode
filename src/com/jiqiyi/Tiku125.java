package com.jiqiyi;

public class Tiku125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome("A man, a plan, a canal: Panama");
	}
	
	public static boolean isPalindrome1(String s) {
        int head = 0,tail = s.length()-1;
        int len = s.length();
        char[] sChars = s.toCharArray(); 
        while(head<tail){
            while(head<len && !Character.isLetterOrDigit(sChars[head])) head++;
            while(tail > 0 && !Character.isLetterOrDigit(sChars[tail])) tail--;
            if(head >= len || tail < 0) break;
            if(sChars[head] == sChars[tail] || Character.toUpperCase(sChars[head]) == Character.toUpperCase(sChars[tail])) {
            	head++;
                tail--;
            }
            else {
            	return false;
			}
        }
        return true;
    }
	
	public static boolean isPalindrome(String s) {
		int len = s.length();
		char[] array = s.toCharArray();
		int head = 0,tail = len-1;
		while (head<tail) {
			while(head<tail && !Character.isLetterOrDigit(array[head])) head++;
			while(head<tail && !Character.isLetterOrDigit(array[tail])) tail--;
			if(head<tail && Character.toUpperCase(array[head])!=Character.toUpperCase(array[tail])) {
				return false;
			}
			head++;
			tail--;
		}
		return true;
	}

}
