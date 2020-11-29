package com.company;

import java.util.*;

class Solution {
    public int[] count, ans;
    public List<Set<Integer>> tree;
    int N;

    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        this.N = N;
        int len = edges.length;
        count = new int[N];
        Arrays.fill(count, 1);
        ans = new int[N];

        if (len < 1) return ans;

        tree = new ArrayList<Set<Integer>>();
        for (int i = 0; i < N; i++) {
            tree.add(new HashSet<Integer>());
        }
        for(int i = 0; i < len; i++) {
            tree.get(edges[i][0]).add(edges[i][1]);
            tree.get(edges[i][1]).add(edges[i][0]);
        }

        dfs(0, -1);
        for (int i : ans)
            System.out.println(i);

        dfs2(0, -1);
        return ans;
    }

    public void dfs(int cur, int parent) {
        for (int child : tree.get(cur)) {
            if (child != parent) {
                dfs(child, cur);
                count[cur] += count[child];
                ans[cur] += ans[child] + count[child];
                System.out.println(child +","+ cur);
            }
        }
    }

    public void dfs2(int cur, int parent) {
        for (int child : tree.get(cur)) {
            if (child != parent) {
                ans[child] = ans[cur] + (N - count[child]) - count[child];
                dfs2(child, cur);
            }
        }
    }
}
