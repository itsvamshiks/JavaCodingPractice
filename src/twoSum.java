public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            int difference = target-nums[i];
            if(!map.containsKey(difference))
                map.put(nums[i],i);
            else{
                result[1] = i;
                result[0] = map.get(difference);
            }

        }

        return result;

    }
}
