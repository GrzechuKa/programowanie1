package dataSructures.binaryTree;

public class NodeBinary<T> {

    private T value;
    private NodeBinary<T> left;
    private NodeBinary<T> right;


    public NodeBinary(T value) {
        this.value = value;
    }

    public NodeBinary<T> getLeft() {
        return left;
    }

    public void setLeft(NodeBinary<T> left) {
        this.left = left;
    }

    public NodeBinary<T> getRight() {
        return right;
    }

    public void setRight(NodeBinary<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }
}
