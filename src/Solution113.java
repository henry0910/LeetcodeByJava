import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if (root == null) return res;
        findPath(root, sum, res, temp);
        return res;
    }
    private void findPath(TreeNode root, int sum, List<List<Integer>> res, List<Integer> temp) {
        if (root == null) return ;
        temp.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return ;
        }
        else {
            findPath(root.left, sum - root.val, res, temp);
            findPath(root.right, sum - root.val, res, temp);
        }
        temp.remove(temp.size() - 1);

    }
}
