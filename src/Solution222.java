import java.util.LinkedList;
import java.util.Queue;

public class Solution222 {
    public int countNodes(TreeNode root) {
        int count = 0;
        if (root == null) return count;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        count++;
        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            if (current.left != null) {
                q.add(current.left);
                count++;
            }
            if (current.right != null) {
                q.add(current.right);
                count++;
            }
        }
        return count;
    }
}
