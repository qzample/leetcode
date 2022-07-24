package com.jiqiyi;

public class Tiku6125 {
    private int[][] grid;
    private int n;
    public int equalPairs(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isSame(i, j)) cnt++;
            }
        }
        return cnt;
    }

    public boolean isSame(int x, int y){
        for(int k=0;k<n;k++){
            if(grid[x][k]!=grid[k][y]) return false;
        }
        return true;
    }
}
