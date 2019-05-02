public class sortColours {
    public void sortColors(int[] nums) {
        int[] colorCount = new int[]{0,0,0};
        for(int i=0;i<nums.length;i++){
            //System.out.println(colorCount[2]);
            colorCount[nums[i]] = colorCount[nums[i]]+1; ;

        }

        int j=0;
        for(int i=0;i<colorCount.length;i++){
            // System.out.println(colorCount[i]);
            while(colorCount[i]!=0){
                nums[j] = i;
                j++;
                colorCount[i]--;
            }
        }


    }
}
