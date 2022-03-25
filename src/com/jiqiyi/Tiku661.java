package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku661 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] img = {{1,1,1},{1,0,1},{1,1,1}};
		imageSmoother(img);
	}

	public static int[][] imageSmoother(int[][] img) {
		int[][] dic = {{0,1},{1,0},{0,-1},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
		int m = img.length;
		int n = img[0].length;
		int[][] ans = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				int cnt=1,sum = img[i][j];
				for(int c=0;c<8;c++) {
					int cx=i+dic[c][0];
					int cy=j+dic[c][1];
					if(cx<0 || cx>=m || cy<0 || cy>=n) continue;
					cnt++;
					sum += img[cx][cy];
				}
				ans[i][j] = sum/cnt;
			}
		}
		return ans;
    }

}
