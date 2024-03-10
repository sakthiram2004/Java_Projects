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
}


class MyMain{
    public static void main(String arg[]){
        BinarySearchTree bst =new BinarySearchTree(50);
        bst.insert(23);
        bst.insert(50);
        bst.insert(40);
        bst.insert(10);
        bst.insert(55);

        bst.display();


    }
}
