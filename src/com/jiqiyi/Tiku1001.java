package com.jiqiyi;

public class Tiku1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
    public static int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
    	int[][] grid = new int[n][n];
    	int[] ans = new int[queries.length];
    	// turn on the light
    	for(int i=0;i<lamps.length;i++)
    	{
    		grid[lamps[i][0]][lamps[i][1]] = 2;
    		illumination(grid, lamps[i][0], lamps[i][1]);
    	}
    	// execute the query
    	for(int i=0;i<queries.length;i++)
    	{
    		ans[i] = grid[queries[i][0]][queries[i][1]]==0 ? 0 : 1;
    		// turn off the light
    		
    	}
    	return null;
    }

    /*
     * illuminate the grid
     * @param grid two diemension array
     * @param x light's row position
     * @param y light's col position
     * */
    public static void illumination(int[][] grid,int x,int y){
    	// row
    	for(int j=0;j<grid[x].length;j++)
		{    		 
    		 if(grid[x][j]!=2) grid[x][j] = 1;
		}
    	// col
    	for(int i=0;i<grid.length;i++)
    	{    		 
    		if(grid[i][y]!=2) grid[i][y] = 1;
    	}
    	// diagonal
    	int tempX= x,tempY = y;
    	while(tempX>=0 && tempX<grid.length && tempY>=0 && tempY<grid[0].length)
    	{    		    	
    		if(grid[tempX][tempY]!=2) grid[tempX][tempY] = 1;
    		tempX++;
			tempY++;
    	}
    	tempX = x;tempY=y;
    	while(tempX>=0 && tempX<grid.length && tempY>=0 && tempY<grid[0].length)
    	{    		    	
    		if(grid[tempX][tempY]!=2) grid[tempX][tempY] = 1;
    		tempX--;
			tempY--;
    	}
    	tempX = x;tempY=y;
    	while(tempX>=0 && tempX<grid.length && tempY>=0 && tempY<grid[0].length)
    	{    		    	
    		if(grid[tempX][tempY]!=2) grid[tempX][tempY] = 1;
    		tempX--;
			tempY++;
    	}
    	tempX = x;tempY=y;
    	while(tempX>=0 && tempX<grid.length && tempY>=0 && tempY<grid[0].length)
    	{    		    	
    		if(grid[tempX][tempY]!=2) grid[tempX][tempY] = 1;
    		tempX++;
			tempY--;
    	}
    }
    
    /*
     * turn off the light
     * @param grid 
     * @param x
     * @param y
     * **/
    public static void turnOff(int[][]grid,int x,int y)
    {
    	
    }
}
