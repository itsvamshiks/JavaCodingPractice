public class numberOfIslands {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        int n = grid.length;
        if(n==0)
            return 0;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    islandChecker(grid,i,j);
                    numIslands++;
                }
            }
        }
        return numIslands;

    }

    public void islandChecker(char[][] grid, int i,int j){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='1')
            return;

        grid[i][j]='0';
        islandChecker(grid,i+1,j);
        islandChecker(grid,i-1,j);
        islandChecker(grid,i,j+1);
        islandChecker(grid,i,j-1);
    }
}
