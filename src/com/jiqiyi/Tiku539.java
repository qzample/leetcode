package com.jiqiyi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Tiku539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] timePoints = {"00:00","23:59","00:00"};
		System.out.println(findMinDifference(Arrays.asList(timePoints)));
//		System.out.println(getMinutes("10:00"));
	}
	
	public static int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        int size = timePoints.size();
        int minDiff = getMinutes(timePoints.get(size-1))-getMinutes(timePoints.get(0));
        for(int i =0;i<timePoints.size()-1;++i) {
        	minDiff = minDiff > getMinutes(timePoints.get(i+1))-getMinutes(timePoints.get(i)) ? getMinutes(timePoints.get(i+1))-getMinutes(timePoints.get(i)) : minDiff;        	
        }
		return minDiff;
    }
	
	public static int getMinutes(String timePoint) {
		return ((timePoint.charAt(0)-'0')*10 + (timePoint.charAt(1)-'0'))*60 + ((timePoint.charAt(3)-'0')*10 + timePoint.charAt(4)-'0');
	}

}
