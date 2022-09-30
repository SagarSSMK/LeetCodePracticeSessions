package BST;

public class BinarySearchTree{

    class Node{
        int key;
        Node left,right;

        public Node(int item){
            key =  item;
            left=right=null;
        }
    }

    Node root;

    BinarySearchTree(){
        root =null;
    }

    BinarySearchTree(int value){
        root = new Node(value);
    }

    Node  insertValue(Node root,int key){

        if(root == null){
            root = new Node(key);
            return root;
        } else if (root.key>key) {
            root.left = insertValue(root.left,key);
        } else if (root.key<key) {
            root.right = insertValue(root.right,key);
        }
        return root;
    }

    void insert(int key) { root = insertValue(root, key); }

    void inorder() {
        inorderRec(root);
    }


    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();

    }
}
