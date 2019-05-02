public class setMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        //O(mn) solution with extra space

        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<Integer> rowSet = new HashSet<Integer>();
        Set<Integer> colSet = new HashSet<Integer>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(rowSet.contains(i)||colSet.contains(j))
                    matrix[i][j]=0;
            }
        }


    }
}
