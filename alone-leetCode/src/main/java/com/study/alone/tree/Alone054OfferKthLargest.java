package com.study.alone.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: hetilong
 * @Date: 2022/2/23 19:54
 */
public class Alone054OfferKthLargest {
    public Set<Integer> set = new HashSet<>();

    public int kthLargest(TreeNode root, int k) {
        add(root);
        Object[] arr = set.toArray();
        return (int)arr[set.size()-k];
    }

    public void add(TreeNode root){
        if(root==null){
            return;
        }
        set.add(root.val);
        add(root.left);
        add(root.right);
    }
}
