package com.study.alone.tree;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 20:34
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){

    }

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left = left;
        this.right = right;
    }
}
