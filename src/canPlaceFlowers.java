public class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ncount=0;
        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                ncount++;
                flowerbed[0]=1;
            }
        }
        else{
            for(int i=0;i<flowerbed.length;i++){
                if(flowerbed[i]==1){
                    continue;
                }
                if(i==0){
                    if(flowerbed[i+1]==0){
                        ncount++;
                        flowerbed[i]=1;
                    }
                }
                if(i>0 && i<flowerbed.length-1){
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        ncount++;
                        flowerbed[i]=1;
                    }
                }
                if(i==flowerbed.length-1){
                    if(flowerbed[i-1]==0){
                        ncount++;
                        flowerbed[i]=1;
                    }
                }
            }
        }


        if(ncount>=n){
            return true;
        }
        return false;
    }
}
