public class partitionLabels {
    public List<Integer> partitionLabels(String S) {
        int[] alpha = new int[26];

        for(int i=0;i<S.length();i++){
            alpha[S.charAt(i)-'a'] = i;
        }

        int j =0,anchor = 0;

        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<S.length();i++){
            j = Math.max(j,alpha[S.charAt(i)-'a']);
            if(i==j){
                res.add(i-anchor+1);
                anchor = i+1;
            }
        }

        return res;
    }
}
