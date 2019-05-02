public class majorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> count = new HashMap<>();

        int len = nums.length/2;
        int majnum=0;

        for(int i=0;i<nums.length;i++){
            if(!count.containsKey(nums[i])){
                count.put(nums[i],1);
                if(len<1)
                    majnum=nums[i];
                //System.out.println("Putting"+ nums[i]);

            }else{
                int cnt = count.get(nums[i])+1;
                count.put(nums[i],cnt);
                //System.out.println("Putting"+ nums[i]+cnt);
                if(cnt>len){
                    majnum=nums[i];
                }

            }
        }
        return majnum;
    }
}
