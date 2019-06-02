public class Solution513 {
    int res = 0, currHeight = 0;
    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValue(root, 1);
        return res;
    }
    private void findBottomLeftValue(TreeNode node, int depth) {
        if (currHeight < depth) {
            res = node.val;
            currHeight = depth;
        }
        if (node.left != null) findBottomLeftValue(node.left, depth + 1);
        if (node.right != null) findBottomLeftValue(node.right, depth + 1);

    }
}
