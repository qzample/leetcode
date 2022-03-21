package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku653 {

	private List<Integer> arrList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean findTarget(TreeNode root, int k) {
		inOrder(root);
		int head = 0,tail = arrList.size()-1;
		while (head<tail) {
			if(arrList.get(head)+arrList.get(tail)==k) {
				return true;
			}
			else if (arrList.get(head)+arrList.get(tail)<k) {
				head++;
			}
			else {
				tail--;
			}
		}
		return false;
    }
	
	public void inOrder(TreeNode node) {
		if(node==null) return;
		inOrder(node.left);
		// do something with the node
		arrList.add(node.val);
		inOrder(node.right);
	}

}
