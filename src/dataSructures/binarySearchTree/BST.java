package dataSructures.binarySearchTree;


import java.util.Optional;

public class BST<T extends Comparable<T>> {


    private Node<T> root;

    public BST(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }


    public void insertVatlue (T value){
        Node<T> node = new Node<>(value);

        if (root == null) {
            root = node;
            return;
        }
        Node<T> current = root;

        while (true) {
            if (node.getValue().compareTo(current.getValue()) < 0) {
                if (current.getLeft() == null) {
                    current.setLeft(node);
                    return;
                }
                current = current.getLeft();
            } else {
                if (current.getRight() == null) {
                    current.setRight(node);
                    return;
                }
                current = current.getRight();
            }
        }
    }
    public Optional searchBinary (T value) {
        if (root.getValue() == value) {
            return Optional.of(root);
        }
        Node<T> current = root;
        while (current != null){
            if (current.getValue() == value){
                return Optional.of(current);
            }
            if (current.getValue().compareTo(value) < 0) {
                current = current.getRight();
            }
            else {
                current = current.getLeft();
            }
        }
            return Optional.empty();
    }

    private void inOrderTraversal (Node<T> nodeBinarySearch){
        if (nodeBinarySearch != null) {
            inOrderTraversal(nodeBinarySearch.getLeft());
            visit(nodeBinarySearch);
            inOrderTraversal(nodeBinarySearch.getRight());
        }
    }

    public void inOrderTraversal () {
        inOrderTraversal(root);
    }
    public void visit(Node<T> nodeBinary){
        System.out.print(nodeBinary.getValue() + " / ");
    }

}
