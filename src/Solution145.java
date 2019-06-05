import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution145 {
    public List<Integer> postOrderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        LinkedList<Integer> res = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode current = st.pop();
            res.addFirst(current.val);
            if (current.left != null) st.push(current.left);
            if (current.right != null) st.push(current.right);
        }
        return res;
    }
//    public List<Integer> postorderTraversal(TreeNode root) {
//        if (root == null) return new ArrayList<>();
//        List<Integer> res = new ArrayList<>();
//        postOrder(res, root);
//        return res;
//    }
//    private void postOrder(List<Integer> res, TreeNode node) {
//        if (node == null) return;
//        postOrder(res, node.left);
//        postOrder(res, node.right);
//        res.add(node.val);
//    }
}
