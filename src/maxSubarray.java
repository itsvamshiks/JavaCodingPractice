public class maxSubarray {
    public int maxSubArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            result[i] = Math.max(result[i-1]+nums[i],nums[i]);
        }
        int maxSumArray = result[0];
        for(int i=0;i<result.length;i++){
            if(maxSumArray<result[i])
                maxSumArray = result[i];
        }
        return maxSumArray;
    }
}
