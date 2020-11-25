package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution bfs = new Solution();
        char[][] grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','0','1'}};
        System.out.println(bfs.numberIslands(grid));
    }
}
