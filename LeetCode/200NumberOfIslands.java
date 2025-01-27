//https://leetcode.com/problems/number-of-islands


// space and time complexity O(m*n)
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    landDFS(grid, i, j);
                }
            }
        }

        return count;
    }

    public void landDFS(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') return;


        grid[i][j] = '0';
        landDFS(grid, i-1, j); //up
        landDFS(grid, i+1, j); //down
        landDFS(grid, i, j-1); //left
        landDFS(grid, i, j+1); //right
    }

}