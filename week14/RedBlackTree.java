package week14;

public class RedBlackTree {
    class Node {
        int val;
        boolean color;
        Node left;
        Node right;
        Node parent;
        public Node(int val, boolean color, Node left, Node right, Node parent) {
            this.val = val;
            this.color = color;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }
    }
    private static  boolean RED = true;
    private static  boolean BLACK = false;
    private Node root;
    
    private boolean isRed(Node x) {
        if (x == null) {
            return false;
        }
        return x.color == RED;
    }
    
    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }
    
    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }
    
    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }
    
    public void insert(int val) {
        root = insert(root, val);
        root.color = BLACK;
    }
    
    private Node insert(Node h, int val) {
        if (h == null) {
            return new Node(val, RED, null, null, null);
        }
    
        if (val < h.val) {
            h.left = insert(h.left, val);
        } else if (val > h.val) {
            h.right = insert(h.right, val);
        } else {
            h.val = val;
        }
    
        if (isRed(h.right) && !isRed(h.left)) {
            h = rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        if (isRed(h.left) && isRed(h.right)) {
            flipColors(h);
        }
    
        return h;
    }
    
}        