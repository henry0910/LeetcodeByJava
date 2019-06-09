import java.util.LinkedList;
import java.util.Queue;

public class Solution226 {
    // Recursive approach
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return root;
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//        root.left = right;
//        root.right = left;
//        return root;
//    }
    // iterative approach
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            TreeNode left = curr.left;
            TreeNode right = curr.right;
            curr.left = right;
            curr.right = left;
            if (left != null) q.add(left);
            if (right != null) q.add(right);
        }
        return root;
    }

}
