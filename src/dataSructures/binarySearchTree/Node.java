package dataSructures.binarySearchTree;

public class Node<T extends Comparable<T>> {

    private T value;
    private Node<T> left;
    private Node<T> right;


    public Node(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node {" +
                "value = " + value +
                ", left = " + left +
                ", right = " + right +
                '}';
    }
}
