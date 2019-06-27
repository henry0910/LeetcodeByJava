import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution653 {
    // traverse all
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        int i = 0, j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == k) return true;
            if (sum < k) {
                i++;
            }
            else {
                j--;
            }
        }

        return false;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
    // Hash Map approach
//    private Map<Integer, Integer> myMap;
//    public boolean findTarget(TreeNode root, int k) {
//        myMap = new HashMap<>();
//        boolean res = traverse(root, k, myMap);
//        return res;
//    }
//    private boolean traverse(TreeNode node, int k, Map<Integer, Integer> myMap) {
//        if (node == null) return false;
//        if (myMap.containsKey(k)) return true;
//        else myMap.put(k - node.val, node.val);
//        return traverse(node.left, k - node.val, myMap) || traverse(node.right, k - node.val, myMap);
//    }
}
