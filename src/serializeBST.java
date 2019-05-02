public class serializeBST {
    private static final String sep = ",";
    private static final String nullStatement = "null";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return nullStatement;

        StringBuilder sb = new StringBuilder();
        Stack<TreeNode> st = new Stack();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            sb.append(root.val).append(sep);
            if(root.right!=null)
                st.push(root.right);
            if(root.left!=null)
                st.push(root.left);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(nullStatement))
            return null;

        String[] strs = data.split(sep);
        Queue<Integer> q = new LinkedList();
        for(String s:strs){
            q.offer(Integer.parseInt(s));
        }
        return getNode(q);
    }

    public TreeNode getNode(Queue<Integer> q){
        if(q.isEmpty())
            return null;

        TreeNode root = new TreeNode(q.poll());
        Queue<Integer> sq = new LinkedList();
        while(!q.isEmpty()&&q.peek()<root.val){
            sq.offer(q.poll());
        }
        root.left = getNode(sq);
        root.right = getNode(q);
        return root;
    }
}
