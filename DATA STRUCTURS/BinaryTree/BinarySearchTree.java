package BinaryTree;

public class BinarySearchTree {
    class Node{
        int val;
        Node right,left;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }
    Node root;
    public BinarySearchTree(int val) {
        root = new Node(val);

    }
    public void insert(int val){
        insert(root,val);

    }

    public void display(){
        inOrder(root);
    }
    public Node insert(Node root,int val) {
        if (root == null) {
            return new Node(val);
        }
        else if(root.val > val){
            root.left= insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;

    }

    public void  inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    public Node search(Node root,int val){
        if(root == null || root.val == val){
            return root;
        }
        if(root.val > val) return search(root.left,val);
        else return search(root.right,val);
    }

    public Node delete(Node root,int val){
        if(root == null) return root;
        if(root.val > val){
            root.left = delete(root.left,val);
        }
        else if(root.val < val){
            root.right = delete(root.right,val);
        }
        else {
            if(root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.val = min(root.right);
            root.right = delete(root.right, root.val);
        }
        return root;
    }
}


class MyMain{
    public static void main(String arg[]){
        BinarySearchTree bst =new BinarySearchTree(50);
        bst.insert(23);
        bst.insert(50);
        bst.insert(40);
        bst.insert(10);
        bst.insert(55);
        if(bst.search(bst.root,90)==null) System.out.println("not found");
        else System.out.println("found");
        bst.display(bst.root,40);




    }
}
