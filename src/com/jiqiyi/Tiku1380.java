package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku1380 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		luckyNumbers(matrix);		
	}
	
	public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[] minRow = new int[m];
        int[] maxCol = new int[n];
        for(int i = 0;i<m;i++)
        {
        	minRow[i] = 100001;        	
        	for(int j=0;j<n;j++)
        	{
        		minRow[i] = Math.min(minRow[i], matrix[i][j]);
        		maxCol[j] = Math.max(maxCol[j], matrix[i][j]);
        	}
        }
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(matrix[i][j] == minRow[i] && matrix[i][j] == maxCol[j]) res.add(matrix[i][j]);
        	}
        }
        return res;
    }

}
