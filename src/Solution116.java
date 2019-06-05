import java.util.LinkedList;
import java.util.Queue;

public class Solution116 {
    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            Queue<Node> level = new LinkedList<>();
            for (int i = 0; i < size; ++i) {
                Node current = q.poll();
                Node left = current.left;
                Node right = current.right;
                if (left != null) {
                    level.offer(left);
                    q.offer(left);
                }
                if (right != null) {
                    level.offer(right);
                    q.offer(right);
                }
            }
            while (!level.isEmpty()) {
                Node current = level.poll();
                if (level.size() > 1) {
                    Node next = level.peek();
                    current.next = next;
                }
                else if (level.size() == 1) {
                    Node next = level.poll();
                    current.next = next;
                    next.next = null;
                }

            }


        }
        return root;
    }
}
