import java.util.*;

class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value=value;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }
    void printPostorder(Node node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.value + " ");
    }
    void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        printPreorder(node.left);
        printPreorder(node.right);
}
void printInorder(Node node) {
    if (node == null)
        return;
    printInorder(node.left);
    System.out.print(node.value + " ");
    printInorder(node.right);
}

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
       tree.root.left.right = new Node(5);
       tree.root.right.left= new Node(6);
       tree.root.right.right= new Node(7);
       tree.root.left.right.right= new Node(8);
       tree.root.right.right.left=new Node(9);
       tree.root.right.right.right=new Node(10);
       
        System.out.println("Postorder traversal: ");
        tree.printPostorder(tree.root);
        System.out.print("\n");
        System.out.println("Preorder traversal: ");
        tree.printPreorder(tree.root);
        System.out.print("\n");
        System.out.println("Inorder traversal: ");
        tree.printInorder(tree.root);
    
    }
}
