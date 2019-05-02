public class happyNumber {
    public boolean isHappy(int n) {

        Set<Integer> sums = new HashSet<Integer>();
        int sqsum,rem;

        while(sums.add(n)){
            sqsum=0;
            while(n>0){
                rem = n%10;
                sqsum+= rem*rem;
                n=n/10;
            }

            if(sqsum==1)
                return true;
            else
                n = sqsum;
        }

        return false;

    }
}
