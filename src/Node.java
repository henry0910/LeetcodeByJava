import java.util.List;

public class Node {
//    public int val;
//    public Node left;
//    public Node right;
//    public Node next;
//    public Node() {}
//    public Node(int _val, Node _left, Node _right, Node _next) {
//        this.val=_val;
//        this.left=_left;
//        this.right=_right;
//        this.next=_next;
//    }

    public int val;
    public List<Node> children;
    public Node() {}
    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
