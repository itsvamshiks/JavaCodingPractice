public class sortArrayByParity {
    public int[] sortArrayByParityII(int[] A) {

        int Alen;
        if(A.length%2==0)
            Alen = A.length/2;
        else
            Alen = (A.length+1)/2;

        int[] even = new int[Alen];
        int[] odd = new int[Alen];
        int j=0,k=0;


        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                even[j]=A[i];
                j++;
            }
            else{
                odd[k]=A[i];
                k++;
            }
        }

        even = Sort(even);
        odd = Sort(odd);
        j=0;
        k=0;

        for(int i=0;i<A.length;i=i+2){
            A[i] = even[j];
            A[i+1] = odd[k];
            j++;
            k++;
        }
        return A;

    }

    public int[] Sort(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
