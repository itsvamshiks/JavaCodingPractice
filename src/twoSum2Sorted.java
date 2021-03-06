public class twoSum2Sorted {
    public int[] twoSum(int[] numbers, int target) {

        int[] index = new int[2];

        if(numbers==null||numbers.length<2)
            return index;

        int left=0,right=numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                index[0] = left+1;
                index[1] = right+1;
                break;
            }else if(sum>target){
                right--;
            }else
                left++;
        }
        return index;

    }
}
