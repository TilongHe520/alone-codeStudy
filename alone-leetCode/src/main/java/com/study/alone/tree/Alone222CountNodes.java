package com.study.alone.tree;

import com.study.alone.tree.TreeNode;

/**
 * @Author: hetilong
 * @Date: 2022/2/16 21:45
 */
public class Alone222CountNodes {
    public int countNodes(TreeNode root) {
        if (root==null){
            return 0;
        }

        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
