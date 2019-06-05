import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> temp = new Stack<>();
        temp.add(root);
        while (temp.size() > 0) {
            TreeNode curr = temp.pop();
            res.add(curr.val);
            if (curr.left == null && curr.right == null) continue;
            if (curr.right != null) temp.add(curr.right);
            if (curr.left != null) temp.add(curr.left);

        }
        return res;
    }
    /* recursive */
//    public List<Integer> preorderTraveral(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        if (root == null ) return res;
//        tra(res, root);
//        return res;
//    }
//    private void tra(List<Integer> res, TreeNode node) {
//        if (node == null) return;
//        res.add(node.val);
//        TreeNode left = node.left;
//        TreeNode right = node.right;
//        tra(res, left);
//        tra(res, right);
//    }
}
