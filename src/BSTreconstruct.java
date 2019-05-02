public class BSTreconstruct {public TreeNode buildTree(int[] preorder, int[] inorder) {
    return treeHelper(0,0,inorder.length-1,preorder,inorder);

}

    public TreeNode treeHelper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder){
        if(preStart>preorder.length-1 || inStart>inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = 0;
        for(int i=inStart; i<=inEnd; i++){
            if(inorder[i]==root.val)
                rootIndex = i;
        }
        root.left = treeHelper(preStart+1, inStart,rootIndex-1,preorder,inorder);
        root.right = treeHelper(preStart+rootIndex+1-inStart,rootIndex+1,inEnd,preorder,inorder);
        return root;
    }

}
