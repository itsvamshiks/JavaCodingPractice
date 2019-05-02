public class palindromeNum {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        int xd = x,rev=0;
        while(xd>0){
            int rem = xd%10;
            rev = rev*10;
            rev+= rem;
            xd = xd/10;
        }

        if(rev == x)
            return true;
        else
            return false;
    }
}
