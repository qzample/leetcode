package com.jiqiyi;

import java.util.PriorityQueue;

public class Tiku1405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

    public static String longestDiverseString(int a, int b, int c) {
    	PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((x,y) -> y[1] - x[1]);
    	// x[0]‘ã•\a x[1]‘ã•\b x[2]‘ã•\c
    	if(a>0) maxHeap.add(new int[] {0,a});
    	if(b>0) maxHeap.add(new int[] {1,b});
    	if(c>0) maxHeap.add(new int[] {2,c});
    	StringBuilder sb = new StringBuilder();
    	while (!maxHeap.isEmpty()) {
			int[] max = maxHeap.poll();
			int n = sb.length();
			if(n>=2 && sb.charAt(n-1)-'a' == sb.charAt(n-2)-'a')
			{
				if(maxHeap.isEmpty()) break;
				else if('a'+max[0] == sb.charAt(n-1))
				{
					int[] secMax = maxHeap.poll();
					sb.append((char)('a'+secMax[0]));
					if(--secMax[1]!=0) maxHeap.add(secMax);					
					maxHeap.add(max);
				}
				else
				{
					sb.append((char)('a'+max[0]));
					if(--max[1]!=0) maxHeap.add(max);
				}
			}
			else
			{
				sb.append((char)('a'+max[0]));
				if(--max[1]!=0) maxHeap.add(max);
			}
		}
    	return sb.toString();
    }
}
