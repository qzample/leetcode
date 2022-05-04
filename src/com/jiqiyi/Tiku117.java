package com.jiqiyi;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.QueryEval;

class Tiku117 {
    /**
     * 空间复杂度为N
     * @param root
     * @return
     */
    public Node1 connect(Node1 root) {
        if(root==null) return root;
        Queue<Node1> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            Node1 pre = null;
            for(int i=0;i<n;i++){
                Node1 cur = queue.poll();
                if(pre!=null){
                    pre.next = cur;
                    pre = cur;
                }
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Node1 node1 = new Node1(0);
        Node1 node2 = new Node1(1);
        Node1 node3 = new Node1(2);
        node1.left = node2;
        node1.right = node3;
        connect1(node1);
    }

    /**
     * 空间复杂度为O(1)的解法
     */
    public static Node1 connect1(Node1 root) {
        Node1 cur = root;
        while(cur!=null){
            Node1 dummy = new Node1(0);
            Node1 pre = dummy;
            while(cur!=null){
                if(cur.left!=null){
                    pre.next = cur.left;
                    pre = cur.left;
                }
                if(cur.right!=null){
                    pre.next = cur.right;
                    pre = cur.right;
                }
                cur = cur.next;
            }
            cur = dummy.next;
        }
        return root;
    }
}
