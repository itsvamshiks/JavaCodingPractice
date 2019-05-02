public class twoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        /*HashMap<Integer,Integer> map = new HashMap();
        List<Integer> list = new ArrayList();
        for(int i=0;i<numbers.length;i++){
            int diff = target - numbers[i];
            if(map.containsKey(diff)){
                list.add(map.get(diff));
                list.add(i+1);
                map.remove(diff);
            }else{
                map.put(numbers[i],i+1);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
        */
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
