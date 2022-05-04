package com.jiqiyi;

class Tiku130 {
    private boolean[][] visited;
    private char[][] board;
    private int m;
    private int n;
    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        this.board = board;
        visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            if(board[i][0]=='O') dfs(i, 0);
            if(board[i][n-1]=='O') dfs(i, n-1);
        }
        for(int j=1;j<n-1;j++){
            if(board[0][j]=='O') dfs(0, j);
            if(board[m-1][j]=='O') dfs(m-1, j);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                switch(board[i][j]){
                    case 'O':{
                        board[i][j] = 'X';
                        break;
                    }
                    case '-':{
                        board[i][j] = 'O';
                        break;
                    }
                }
            }
        }
    }
    public void dfs(int x,int y){
        if(x<0 || x>=m || y<0 || y>=n || visited[x][y]) return;
        if(board[x][y]=='X') return;
        board[x][y] = '-';
        visited[x][y] = true;
        dfs(x-1, y);
        dfs(x+1, y);
        dfs(x, y-1);
        dfs(x, y+1);
    }
}
