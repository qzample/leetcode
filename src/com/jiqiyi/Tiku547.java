package com.jiqiyi;

import java.util.HashMap;
import java.util.Map;

class Tiku547 {
    /**
     * 并查集去解决
     */
    private Map<Integer,Integer> map;
    private int cnt=0;
    public int find(int x){
        int root=x;
        while(map.get(root)!=null){
            root = map.get(root);
        }
        while(x!=root){
            int originFather = map.get(x);
            map.put(x, root);
            x = originFather;
        }
        return root;
    }

    public void add(int x){
        if(!map.containsKey(x)){
            cnt++;
            map.put(x, null);
        }
    }

    public void merge(int x,int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX!=rootY){
            map.put(rootX, rootY);
            cnt--;
        }
    }

    public boolean isConnected(int x,int y){
        return find(x)==find(y);
    }
    public int findCircleNum(int[][] isConnected) {
        map = new HashMap<>();
        int m = isConnected.length;
        for(int i=0;i<m;i++){
            add(i);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                if(isConnected[i][j]==1){
                    merge(i, j);
                }
            }
        }
        return cnt;
    }


    /**
     * 使用dfs深度优先遍历
     */
    public int findCircleNum1(int[][] isConnected) {
        int m = isConnected.length;
        int cnt = 0;
        int[] visited = new int[m];
        for(int i=0;i<m;i++){
            if(visited[i]==0){
                cnt++;
                dfs(visited,isConnected,i);
            }
        }
        return cnt;
    }
    
    public void dfs(int[] visited,int[][] isConnected,int cur){
        if(visited[cur]==1) return;
        visited[cur] = 1;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[cur][i]==1) dfs(visited, isConnected, i);
        }
    }
}
