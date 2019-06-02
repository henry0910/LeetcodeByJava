import java.util.*;

public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; ++i) {
                TreeNode current = q.poll();
                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
                level.add(current.val);
            }
            res.add(level);
        }
        Collections.reverse(res);
        return res;
    }
}
