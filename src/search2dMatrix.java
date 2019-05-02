public class search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length<1 || matrix[0].length<1)
            return false;
        int row=0,col = matrix[0].length-1;
        while(col>=0 && row<matrix.length){
            if(matrix[row][col]==target)
                return true;
            else if(target<matrix[row][col]){
                col--;
            }else if(target>matrix[row][col]){
                row++;
            }
        }

        return false;

    }
}
