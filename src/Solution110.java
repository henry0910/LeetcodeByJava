public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = helper(root.left);
        int right = helper(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int helper(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(helper(node.left), helper(node.right));
    }
}
