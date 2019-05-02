public class validMountainArray {
    public boolean validMountainArray(int[] A) {

        /*if(A.length<3)
            return false;

        boolean upFlag=false,downFlag=false;
        for(int i=0;i<A.length;i++){
            if()
        }*/









        boolean upFlag=false,downFlag=false;
        if(A.length<3)
            return false;

        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                if(downFlag){
                    upFlag=false;
                }else{
                    upFlag=true;
                    downFlag=false;
                }
            }else if(A[i]<A[i-1]){
                downFlag=true;
            }else{
                upFlag=false;
                downFlag=false;
            }
        }
        /*if(A[0]>A[A.length-1]){
            upFlag=false;
            downFlag=false;
        }*/
        if(upFlag==true && downFlag==true)
            return true;

        return false;



    }
}
