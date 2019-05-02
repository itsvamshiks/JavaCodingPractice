public class kthSmallestBST {
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = countNodes(root.left);
        if(k<=leftCount){
            return kthSmallest(root.left,k);
        }else if(k>leftCount+1){
            return kthSmallest(root.right,k-leftCount-1);
        }

        return root.val;


    }

    public int countNodes(TreeNode root){
        if(root==null)
            return 0;
        else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
}
