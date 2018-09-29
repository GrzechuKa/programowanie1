package dataSructures.binarySearchTree;

public class RunnerBST {

    public static void main(String[] args) {


        NodeBST<Integer> root = new NodeBST<>(5);

        BST<Integer> BST = new BST(root);


        BST.insertVatlue(3);
        BST.insertVatlue(9);

        BST.inOrderTraversal();

        System.out.println();

        System.out.println(BST.searchBinary(9));


    }
}
