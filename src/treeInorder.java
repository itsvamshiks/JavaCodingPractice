public class treeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inorder(root,result);
        return result;
    }

    public void inorder(TreeNode root,List<Integer> res){

        if(root!=null){
            if(root.left!=null){
                inorder(root.left,res);
            }
            res.add(root.val);
            if(root.right!=null){
                inorder(root.right,res);
            }
        }
    }
}
