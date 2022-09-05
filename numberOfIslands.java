class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        boolean[][] tfGrid = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (tfGrid[i][j] == true || grid[i][j] == '0') continue;
                islands++;
                tfGrid = fillOnes(grid, tfGrid, i, j);
            }
        }
        return islands;
    }
    public boolean[][] fillOnes(char[][] grid, boolean[][] tfGrid, int x, int y) {
        // < > ^ down
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1,0}};
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        tfGrid[x][y] = true;
        int[] init = {x, y};
        stack.add(init);
        while (!stack.isEmpty()) {
            int[] curr = stack.pop();
            for (int i = 0; i < dir.length; i++) {
                int r = curr[0] + dir[i][0];
                int c = curr[1] + dir[i][1];
                if (r >= grid.length || r < 0) continue;
                if (c >= grid[0].length || c < 0) continue;
                if(tfGrid[r][c] == true) continue;
                if (grid[r][c] == '1') {
                    tfGrid[r][c] = true;
                    int[] temp = {r, c};
                    stack.add(temp);
                }
            }
        }
        return tfGrid;
    }
}