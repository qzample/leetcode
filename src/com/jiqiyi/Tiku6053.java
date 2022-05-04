package com.jiqiyi;

class Tiku6053 {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] map = new int[m][n];
        for(int i=0,k=walls.length;i<k;i++){
            int x = walls[i][0];
            int y = walls[i][1];
            map[x][y] = -1;
        }
        for(int i=0,k=guards.length;i<k;i++){
            int x = guards[i][0];
            int y = guards[i][1];
            int tempX = x,tempY=y;
            map[tempX][tempY] = 2;
            while(tempX>0){
                tempX--;
                if(map[tempX][y]!=-1 && map[tempX][y]!=2){
                    map[tempX][y]=1;
                    continue;
                }
                break;
            }
            tempX = x;
            while(tempX<m-1){
                tempX++;
                if(map[tempX][y]!=-1 && map[tempX][y]!=2){
                    map[tempX][y]=1;
                    continue;
                }
                break;
            }
            while(tempY>0){
                tempY--;
                if(map[x][tempY]!=-1 && map[x][tempY]!=2){
                    map[x][tempY]=1;
                    continue;
                }
                break;
            }
            tempY = y;
            while(tempY<n-1){
                tempY++;
                if(map[x][tempY]!=-1 && map[x][tempY]!=2){
                    map[x][tempY]=1;
                    continue;
                }
                break;
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==0) cnt++;
            }
        }
        return cnt;
    }
}
