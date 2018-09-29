package dataSructures.binaryTree;

public class RunnerTree {

    public static void main(String[] args) {

        NodeBinary<Integer> nodeBinary1 = new NodeBinary<>(10);
        NodeBinary<Integer> nodeBinary2 = new NodeBinary<>(20);
        NodeBinary<Integer> nodeBinary3 = new NodeBinary<>(30);
        NodeBinary<Integer> nodeBinary4 = new NodeBinary<>(40);
        NodeBinary<Integer> nodeBinary5 = new NodeBinary<>(50);
        NodeBinary<Integer> nodeBinary6 = new NodeBinary<>(60);
        NodeBinary<Integer> nodeBinary7 = new NodeBinary<>(70);
        NodeBinary<Integer> nodeBinary8 = new NodeBinary<>(80);

        nodeBinary1.setLeft(nodeBinary2);
        nodeBinary1.setRight(nodeBinary3);
        nodeBinary2.setLeft(nodeBinary4);
        nodeBinary2.setRight(nodeBinary5);
        nodeBinary3.setLeft(nodeBinary6);
        nodeBinary3.setRight(nodeBinary7);
        nodeBinary4.setLeft(nodeBinary8);


        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(nodeBinary1);

        binaryTree.inOrderTraversal();
        System.out.println();
        binaryTree.preOrderTraversal(binaryTree.getRoot());
        System.out.println();
        binaryTree.postOrderTraversal(binaryTree.getRoot());

    }
}
