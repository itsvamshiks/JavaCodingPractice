public class jewelsAndStones {
    public int numJewelsInStones(String J, String S) {

        HashSet<Character> set = new HashSet();
        for(int i=0;i<J.length();i++){
            char ch = J.charAt(i);
            set.add(ch);
        }

        int sum =0;
        for(int i=0;i<S.length();i++){
            if(set.contains(S.charAt(i)))
                sum++;
        }
        return sum;
    }
}
