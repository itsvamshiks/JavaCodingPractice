public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return countPaths(m-1,n-1,new int[m][n]);
    }
    private int countPaths(int m,int n,int[][] grid){
        if(m==0 || n==0)
            return grid[m][n] = 1;
        else{
            return grid[m][n] = (grid[m][n]>0)?grid[m][n]:(countPaths(m-1,n,grid)+countPaths(m,n-1,grid));
        }
    }
}
