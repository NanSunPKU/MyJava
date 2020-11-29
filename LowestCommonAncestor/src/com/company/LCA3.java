package com.company;


import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};


public class LCA3 {
    class Solution {
        public Node lowestCommonAncestor(Node p, Node q) {
            List<Node> path = storePath(p);
            while (q.parent != null) {
                if (path.contains(q))
                    return q;
                else
                    q = q.parent;
            }
            return q;
        }

        public List<Node> storePath(Node root) {
            List<Node> path = new ArrayList<>();

            while (root.parent != null) {
                path.add(root);
                root = root.parent;
            }
            return path;
        }

        public Node lowestCommonAncestor1(Node p, Node q) {
            Node p1 = p, p2 = q;
            while (p1 != p2) {
                p1 = p1 == null ? q : p1.parent;
                p2 = p2 == null ? p : p2.parent;
            }
            return p1;
        }
    }
}
