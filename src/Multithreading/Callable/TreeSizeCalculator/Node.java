package Multithreading.Callable.TreeSizeCalculator;

public class Node {
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private Node left = null;
    private Node right = null;
    private int data;
    public Node(Node left, Node right, int data){
        this.left=left;
        this.right = right;
        this.data= data;
    }
}
