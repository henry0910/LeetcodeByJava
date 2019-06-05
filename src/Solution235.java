import java.util.*;

public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        Stack<TreeNode> st = new Stack<>();
        parent.put(root, null);
        st.push(root);
        while (!parent.containsKey(p) || !parent.containsKey(q)) {
            TreeNode current = st.pop();
            if (current.left != null) {
                parent.put(current.left, current);
                st.push(current.left);
            }
            if (current.right != null) {
                parent.put(current.right, current);
                st.push(current.right);
            }
        }
        Set<TreeNode> ancestors = new HashSet<>();
        while (p != null) {
            ancestors.add(p);
            p = parent.get(p);
        }
        while (!ancestors.contains(q)) q = parent.get(q);
        return q;
    }
}
