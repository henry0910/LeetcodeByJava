public class Solution236 {
    // recursive approach
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Map<TreeNode, TreeNode> parent = new HashMap<>();
//        Stack<TreeNode> st = new Stack<>();
//        parent.put(root, null);
//        st.push(root);
//        while (!parent.containsKey(p) || !parent.containsKey(q)) {
//            TreeNode current = st.pop();
//            if (current.left != null) {
//                parent.put(current.left, current);
//                st.push(current.left);
//            }
//            if (current.right != null) {
//                parent.put(current.right, current);
//                st.push(current.right);
//            }
//        }
//        Set<TreeNode> ancestors = new HashSet<>();
//        while (p != null) {
//            ancestors.add(p);
//            p = parent.get(p);
//        }
//        while (!ancestors.contains(q)) q = parent.get(q);
//        return q;
//    }
}
