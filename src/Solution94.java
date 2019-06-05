import java.util.ArrayList;
import java.util.List;

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        return res;
    }
    private void inOrder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inOrder(node.left, res);
        res.add(node.val);
        inOrder(node.right, res);
    }
}
