public class zigzagBTLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if(root==null)
            return result;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean order = true;
        int size = 1;

        while(!q.isEmpty()){
            ArrayList<Integer> curList = new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode curNode = q.poll();
                if(order){
                    curList.add(curNode.val);
                }else{
                    curList.add(0,curNode.val);
                }

                if(curNode.left!=null)
                    q.add(curNode.left);
                if(curNode.right!=null)
                    q.add(curNode.right);
            }

            size = q.size();
            order = !order;
            result.add(curList);
        }

        return result;
    }
}
