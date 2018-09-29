package dataSructures.binaryTree;

public class BinaryTree<T> {

    private NodeBinary<T> root;


    public void setRoot(NodeBinary<T> root) {
        this.root = root;
    }

    public NodeBinary<T> getRoot() {
        return root;
    }

    private void inOrderTraversal (NodeBinary<T> nodeBinary){
        if (nodeBinary != null) {
            inOrderTraversal(nodeBinary.getLeft());
            visit(nodeBinary);
            inOrderTraversal(nodeBinary.getRight());
        }
    }

    public void inOrderTraversal () {
        inOrderTraversal(root);
    }


    public void preOrderTraversal (NodeBinary<T> nodeBinary) {
        if (nodeBinary != null){
            visit(nodeBinary);
            preOrderTraversal(nodeBinary.getLeft());
            preOrderTraversal(nodeBinary.getRight());
        }
    }

    public void postOrderTraversal (NodeBinary<T> nodeBinary) {
        if (nodeBinary != null) {
            postOrderTraversal(nodeBinary.getLeft());
            postOrderTraversal(nodeBinary.getRight());
            visit(nodeBinary);
        }
    }


    public void visit(NodeBinary<T> nodeBinary){
        System.out.print(nodeBinary.getValue() + " / ");
    }
}
