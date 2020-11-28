package com.company;

import com.sun.source.tree.Tree;

public class LCA1 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null)
            return null;

        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);

        if (root == p || root == q)
            return root;

        if (l != null && r != null)
            return root;
        return l == null ? r : l;
    }
}
