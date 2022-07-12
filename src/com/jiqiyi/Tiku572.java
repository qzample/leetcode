package com.jiqiyi;

class Tiku572 {
    /**
     * 一棵树是另一棵树的子树
     *  1. 两棵树相等
     *  2. 是另一棵树的左子树
     *  3. 是另一棵树的右子树
     * @param root
     * @param subRoot
     * @return
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isSameTree(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        if(root.val!=subRoot.val) return false;
        return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
    }


    /**
     * the second time to practice
     * @param root
     * @param subRoot
     * @return
     */
    public boolean isSubtree2(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(isSameTree2(root, subRoot)) return true;
        return isSubtree2(root.left, subRoot)
            || isSubtree2(root.right, subRoot);
    }

    public boolean isSameTree2(TreeNode tree1,TreeNode tree2){
        if(tree1==null && tree2==null) return true;
        if(tree1==null || tree2==null) return false;
        if(tree1.val!=tree2.val) return false;
        return isSameTree(tree1.left, tree2.left)
               && isSameTree(tree1.right, tree2.right);
    }
}
