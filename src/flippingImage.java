public class flippingImage {
    public int[][] flipAndInvertImage(int[][] A) {

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length/2;j++){
                int lnin = A[i].length;
                int temp = A[i][j];
                A[i][j] = A[i][lnin - j - 1];
                A[i][lnin - j - 1] = temp;
            }

            for(int j=0;j<A[i].length;j++){
                A[i][j] = A[i][j]^1;
            }
        }

        System.out.println(A);
        return A;

    }
}
