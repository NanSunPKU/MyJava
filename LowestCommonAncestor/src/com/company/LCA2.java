package com.company;

public class LCA2 {

    int count = 0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = dfs(root, p, q);
        return count == 2 ? result : null;

    }

    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        TreeNode l = dfs(root.left, p, q);
        TreeNode r = dfs(root.right, p, q);

        if (root == p || root == q) {
            count++;
            return root;
        }

        return l == null ? r : r == null ? l : root;
    }
}

// use boolean
class LCA21 {
    boolean pFound;
    boolean qFound;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = dfs(root, p, q);
        return pFound && qFound ? result : null;

    }

    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        TreeNode l = dfs(root.left, p, q);
        TreeNode r = dfs(root.right, p, q);

        if (root == p) {
            pFound = true;
            return root;
        }

        if (root == q) {
            qFound = true;
            return root;
        }

        return l == null ? r : r == null ? l : root;
    }
}