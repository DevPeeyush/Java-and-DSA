package DSA.Trees;

public class L2SumOfNodesValue {
    private static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left); // Left subtree
        display(root.right);  //  right subtree
    }
    // Sum of node
    private static int getSum(Node root){
        if(root == null) return 0;
        return root.val + getSum(root.left) + getSum(root.right);
    }
    // Product of nodes
    private static int getProduct(Node root){
        if(root == null) return 1;
        return root.val * getProduct(root.left) * getProduct(root.right);
    }
    // Max values
    private static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val , b= max(root.left), c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    // Min values
    private static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val , b= min(root.left), c = min(root.right);
        return Math.min(a,Math.min(b,c));
    }
    // Size of tree
    private static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    // Level of trees
    private static int level(Node root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }
    public static void main(String[] args) {
        int sum = 0;
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = c; a.right = b;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println(e.val);
        System.out.println(a.left.right.val);
        System.out.println("Value of nodes in tree : ");
        display(a);
        System.out.println();
        System.out.println("Sum of values of  nodes in tree : " + getSum(a));
        System.out.println("Product of values of  nodes in tree : " + getProduct(a));
        System.out.println("Maximum of values of  nodes in tree : " + max(a));
        System.out.println("Minimum of values of  nodes in tree : " + min(a));
        System.out.println("Size of tree is : "+ size(a));
        System.out.println("Level of tree is : "+ level(a));
    }

}
