public class Solution404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return root == null ? 0 : traverse(root.left, true) + traverse(root.right, false);
    }

    private int traverse(TreeNode node, boolean isLeft) {
        if (node == null) return 0;
        if (node.left == null && node.right == null && isLeft) return node.val;
        return traverse(node.left, true) + traverse(node.right, false);
    }
}
