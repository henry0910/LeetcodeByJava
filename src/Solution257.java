import java.util.ArrayList;
import java.util.List;

public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        dfs(result, new StringBuilder(), root);
        return result;
    }
    private void dfs(List<String> result, StringBuilder builder, TreeNode node) {
        if (node.left == null && node.right == null) {
            builder.append(node.val);
            result.add(builder.toString());
            return;
        }
        builder.append(node.val);
        builder.append("->");
        if (node.left != null)
            dfs(result, new StringBuilder(builder.toString()), node.left);
        if (node.right != null)
            dfs(result, new StringBuilder(builder.toString()), node.right);

    }
}
