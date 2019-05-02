public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList();
        if(root==null)
            return res;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> sl = new ArrayList();
            for(int i=0;i<levelSize;i++){
                if(queue.peek().left!= null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);

                sl.add(queue.poll().val);

            }
            res.add(sl);
        }
        return res;


    }
}
