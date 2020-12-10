package com.company;

import java.util.ArrayDeque;
import java.util.List;

/*
*Serialization is converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work. You need to ensure that a binary search tree can be serialized to a string, and this string can be deserialized to the original tree structure.
* */
public class Solution {
    private StringBuilder sb = new StringBuilder();

    public String preorder(TreeNode node) {

        if (node == null) {
            return "";
        }
        sb.append(node.val+" ");
        preorder(node.left);
        preorder(node.right);
        return sb.toString();

    }
    public String serialize(TreeNode root) {
        return preorder(root);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }

        ArrayDeque<Integer> vals = new ArrayDeque<>();

        for (String s: data.split("\\s+")) {
            vals.add(Integer.valueOf(s));
        }
        return build(Integer.MIN_VALUE, Integer.MAX_VALUE, vals);
    }

    public TreeNode build(int low, int high, ArrayDeque<Integer> vals) {
        if (vals.isEmpty() || vals.getFirst() < low || vals.getFirst() > high) {
            return null;
        }

        int val = vals.removeFirst();
        TreeNode root = new TreeNode(val);
        root.left = build(low, val, vals);
        root.right = build(val, high, vals);

//        System.out.println(root.val);
        return root;
    }
}
