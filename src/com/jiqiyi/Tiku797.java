package com.jiqiyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Tiku797 {
    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> list = new LinkedList<>();
    private int[][] graph;
    private int m;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        m = graph.length;
        list.add(0);
        dfs(0);
        return res;
    }
    public void dfs(int cur){
        if(cur==m-1){
            res.add(new ArrayList<>(list));
            list.clear();
            return;
        }
        int[] path = graph[cur];
        for(int i=0;i<path.length;i++){
            list.add(graph[cur][i]);
            dfs(graph[cur][i]);
            list.removeLast();
        }
    }
}
