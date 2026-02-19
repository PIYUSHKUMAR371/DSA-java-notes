public class binarySearchTreeMain {
    
    //Binary Search Tree =  tree data structure ,where each node i sgreater than it,s left child,
    //                      but less than it's right

    //                      benefit : easy to locate a node when they are in this order

    //                      time complexity : best case O(log n)
    //                                        worst case O(n)

    //                      space complexity: O(n)
    public static void main(String[] args){
        binarySearchTree tree = new binarySearchTree();

        tree.insert(new binarySearchTreeNode(5));
        tree.insert(new binarySearchTreeNode(1));
        tree.insert(new binarySearchTreeNode(9));
        tree.insert(new binarySearchTreeNode(2));
        tree.insert(new binarySearchTreeNode(7));
        tree.insert(new binarySearchTreeNode(3));
        tree.insert(new binarySearchTreeNode(6));
        tree.insert(new binarySearchTreeNode(4));
        tree.insert(new binarySearchTreeNode(8));

        tree.remove(7);
        tree.display();
        System.out.println("Inorder start from here");
        tree.inOrder();
        System.out.println("preorder start from here");
        tree.preOrder();
        System.out.println("postorder start from here");
        tree.postOrder();

        System.out.println(tree.search(0));
    }
}
