public class longestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0]=1;
        int maxSize = 1;
        for(int i=1;i<dp.length;i++){
            int currMaxSize = 0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    currMaxSize = Math.max(currMaxSize,dp[j]);
                }
            }
            dp[i] = currMaxSize+1;
            maxSize = Math.max(maxSize,dp[i]);
        }
        return maxSize;
    }
}
