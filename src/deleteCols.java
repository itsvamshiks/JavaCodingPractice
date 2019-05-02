public class deleteCols {
    public int minDeletionSize(String[] A) {
        int colCount=0;

        for(int i=0;i<A[0].length();i++){
            boolean flag=true;
            for(int j=1;j<A.length;j++){
                if(A[j].charAt(i)-A[j-1].charAt(i)<0){
                    flag=false;
                    break;
                }
            }
            if(flag==false)
                colCount++;

        }
        return colCount;

    }
}
