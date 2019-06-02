import java.util.*;

public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.add(root);
        int idx = 0;
        while (!q.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                TreeNode current = q.poll();
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
                curr.add(current.val);

            }
            if (idx % 2 != 0) Collections.reverse(curr);
            res.add(curr);
            idx++;
        }
        return res;
    }
}
