package com.study.alone.leet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hetilong
 * @Date: 2022/2/13 20:33
 */
public class Alone094InorderTraversal {

    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return null;
    }

    public static void inorder(TreeNode root,List<Integer> res){
        if (root == null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
