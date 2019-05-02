public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int numIslands = 0,largest = 0;
        int n = grid.length;
        if(n==0)
            return 0;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    int islandSize = islandChecker(grid,i,j);
                    largest = Math.max(islandSize,largest);
                    numIslands++;
                }
            }
        }
        System.out.println("Largest island size"+largest);
        return numIslands;

    }

    public int islandChecker(char[][] grid, int i,int j){
        int n = grid.length;
        int m = grid[0].length;
        int sum = 0;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='1')
            return 0;

        grid[i][j]='0';
        sum+= islandChecker(grid,i+1,j);
        sum+= islandChecker(grid,i-1,j);
        sum+= islandChecker(grid,i,j+1);
        sum+= islandChecker(grid,i,j-1);

        return sum+1;
    }
}
