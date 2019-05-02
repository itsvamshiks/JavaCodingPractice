public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {

        int[] a = new int[26];
        for(int i=0;i<S.length();i++){
            a[S.charAt(i)-'a'] = i;
        }
        int j=0,anchor=0;
        List<Integer> result = new ArrayList();
        for(int i=0;i<S.length();i++){
            j = Math.max(j,a[S.charAt(i)-'a']);
            if(i==j){
                result.add(i-anchor+1);
                anchor = i+1;
            }
        }
        return result;
    }
}
