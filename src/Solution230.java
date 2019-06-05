import java.util.Stack;

public class Solution230 {
    // dfs solution iterative
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        while (root != null) {
            st.push(root);
            root = root.left;
        }
        while (k != 0) {
            TreeNode n = st.pop();
            k--;
            if (k == 0) return n.val;
            TreeNode right = n.right;
            while (right != null) {
                st.push(right);
                right = right.left;
            }
        }
        return -1;
    }
//    // dfs solution recursive
//    private static int number = 0;
//    private static int count = 0;
//    public int kthSmallest(TreeNode root, int k) {
//        count = k;
//        helper(root);
//        return number;
//    }
//    private void helper(TreeNode n) {
//        if (n.left != null) helper(n.left);
//        count--;
//        if (count == 0) {
//            number = n.val;
//            return;
//        }
//        if (n.right != null) helper(n.right);
//    }
//    public int kthSmallest(TreeNode root, int k) {
//        List<Integer> res = traverseTree(root);
//        int[] temp = new int[res.size()];
//        int idx = 0;
//        for (Integer i : res) temp[idx++] = i;
//        Arrays.sort(temp);
//        return temp[k-1];
//    }
//    private List<Integer> traverseTree(TreeNode root) {
//        if (root == null) return null;
//        List<Integer> res = new ArrayList<>();
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        res.add(root.val);
//        while (!q.isEmpty()) {
//            TreeNode current = q.poll();
//            if (current.left != null) {
//                q.add(current.left);
//                res.add(current.left.val);
//            }
//            if (current.right != null) {
//                q.add(current.right);
//                res.add(current.right.val);
//            }
//        }
//        return res;
//    }
}
