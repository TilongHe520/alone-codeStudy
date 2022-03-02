package com.study.alone.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/22 21:36
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历
 */
public class Alone145PostorderTraversal {
    public List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return list;
    }

    public void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
    }
}
