public class permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        ArrayList<Integer> numsList = new ArrayList<Integer>();

        for(int n:nums){
            numsList.add(n);
        }

        int n = nums.length;
        backtrack(n,numsList,output,0);
        return output;
    }

    public void backtrack(int n,ArrayList<Integer> nums,List<List<Integer>> output,int first){
        if(first==n)
            output.add(new ArrayList<Integer>(nums));

        for(int i=first;i<n;i++){
            Collections.swap(nums,first,i);
            backtrack(n,nums,output,first+1);
            Collections.swap(nums,first,i);
        }
    }
}
