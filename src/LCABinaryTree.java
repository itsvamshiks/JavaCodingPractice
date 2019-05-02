public class LCABinaryTree {
    private TreeNode ca;
    public Solution(){
        this.ca = null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.recurseTree(root,p,q);
        return this.ca;

    }

    private boolean recurseTree(TreeNode current, TreeNode p,TreeNode q){
        if(current ==null)
            return false;

        int left = this.recurseTree(current.left,p,q)?1:0;
        int right = this.recurseTree(current.right,p,q)?1:0;

        int mid = (current==p||current==q)?1:0;

        if(mid+left+right>=2){
            this.ca = current;
        }
        return (mid+right+left>0);

    }
}
