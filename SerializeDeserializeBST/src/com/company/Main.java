package com.company;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        Solution solution = new Solution();
        String resultString = solution.serialize(root);
        System.out.println(resultString);

        TreeNode node = solution.deserialize(resultString);

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if (node == null)
            return;
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.removeFirst();
            System.out.println("current node is:" + cur.val);
            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }

    }
}
