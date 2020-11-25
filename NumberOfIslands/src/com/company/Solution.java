package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numberIslands(char[][] grid) {

        if (grid == null || grid.length == 0)
            return 0;

        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];

        Queue<Coordinate> queue = new ArrayDeque<>();
        int islands = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    islands++;
                    queue.add(new Coordinate(i, j));
                    visited[i][j] = true;

                    while (!queue.isEmpty()) {
                        Coordinate curr = queue.poll();
                        for (int[] direction : directions) {
                            int neiX = curr.x + direction[0];
                            int neiY = curr.y + direction[1];
                            if (neiX >= 0 && neiY >= 0 && neiX < row && neiY < col && grid[neiX][neiY] == '1' && !visited[neiX][neiY]) {
                                queue.add(new Coordinate(neiX, neiY));
                                visited[neiX][neiY] = true;
                            }
                        }
                    }
                }
            }
        }
        return islands;
    }
}
