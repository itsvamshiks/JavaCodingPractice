public class BSTRightView {
    public List<Integer> rightSideView(TreeNode root) {
        //BFS approach
        Map<Integer,Integer> rmv = new HashMap();

        int maxDepth = -1;

        Queue<TreeNode> nodeQ = new LinkedList<TreeNode>();
        Queue<Integer> depthQ = new LinkedList<Integer>();

        nodeQ.add(root);
        depthQ.add(0);

        while(!nodeQ.isEmpty()){
            TreeNode node = nodeQ.remove();
            int depth = depthQ.remove();

            if(node!=null){
                maxDepth = Math.max(maxDepth,depth);

                rmv.put(depth,node.val);

                nodeQ.add(node.left);
                nodeQ.add(node.right);
                depthQ.add(depth+1);
                depthQ.add(depth+1);

            }


        }

        List<Integer> result = new ArrayList();

        for(int i=0;i<=maxDepth;i++){
            result.add(rmv.get(i));
        }
        return result;



    }
}
