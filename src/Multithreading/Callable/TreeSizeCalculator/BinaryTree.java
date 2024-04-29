package Multithreading.Callable.TreeSizeCalculator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BinaryTree {
    public static void main(String[] args) {
        // Creating nodes for the binary tree
        Node node7 = new Node(null, null, 7);
        Node node6 = new Node(null, null, 6);
        Node node5 = new Node(null, null, 5);
        Node node4 = new Node(null, null, 4);
        Node node3 = new Node(node6, node7, 3);
        Node node2 = new Node(node4, node5, 2);
        Node root = new Node(node2, node3, 1);

        // Printing the binary tree
        System.out.println("Binary Tree:");
        printTree(root);

        ExecutorService exeSrvc = Executors.newCachedThreadPool();
        TreeSizeCalculator treeSizeCalculator = new TreeSizeCalculator(root,exeSrvc);
        Future<Integer> sizeFuture = exeSrvc.submit(treeSizeCalculator);
        try{
            System.out.println("Tree Size : " +sizeFuture.get());
        }
        catch (Exception e){
            System.out.println("error occured");
        }

    }

    // Function to print the binary tree using inorder traversal
    public static void printTree(Node root) {
        if (root == null)
            return;

        // Traverse left
        printTree(root.getLeft());

        // Print current node's data
        System.out.print(root.getData() + " ");

        // Traverse right
        printTree(root.getRight());
    }
}
