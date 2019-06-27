import java.util.ArrayList;
import java.util.List;

public class Solution897 {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList();
        inorder(root, vals);
        TreeNode ans = new TreeNode(0), cur = ans;
        for (Integer val : vals) {
            cur.right = new TreeNode(val);
            cur = cur.right;
        }
        return ans.right;
    }

    private void inorder(TreeNode node, List<Integer> vals) {
        if (node == null) return;
        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right, vals);
    }
}
