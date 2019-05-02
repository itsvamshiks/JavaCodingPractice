public class subsets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList();
        res.add(new ArrayList<Integer>());
        for(int n:nums){
            int size = res.size();
            for(int i=0;i<size;i++){
                List<Integer> cur = new ArrayList<>(res.get(i));
                cur.add(n);
                res.add(cur);
            }
        }

        return res;


    }
}
