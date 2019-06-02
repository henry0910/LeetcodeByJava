import java.util.ArrayList;
import java.util.List;

public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> p1 = new ArrayList<>();
        List<Integer> p2 = new ArrayList<>();
        dfs(p1, p);
        dfs(p2, q);
        return p1.equals(p2);
    }
    private void dfs(List<Integer> p, TreeNode node) {
        if (node == null) {
            p.add(null);
            return;
        }
        p.add(node.val);
        dfs(p, node.left);
        dfs(p, node.right);
    }
}
