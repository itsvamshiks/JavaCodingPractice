public class lcaBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        int pv = p.val;
        int qv = q.val;

        TreeNode cur = root;

        while(cur!=null){
            if(pv>cur.val&&qv>cur.val){
                cur = cur.right;
            }else if(pv<cur.val&&qv<cur.val){
                cur = cur.left;
            }else{
                return cur;
            }
        }
        return null;

    }
}
