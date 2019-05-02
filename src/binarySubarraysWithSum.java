public class binarySubarraysWithSum {
    public int numSubarraysWithSum(int[] A, int S) {
        int count = 0,sum=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,1);
        for(int i=0;i<A.length;i++){
            sum+= A[i];
            if(hm.containsKey(sum-S)){
                count+=hm.get(sum-S);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
