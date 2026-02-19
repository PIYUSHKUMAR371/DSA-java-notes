public class binarySearchTree {
    
    binarySearchTreeNode root;

    public void insert(binarySearchTreeNode node){
        root = insertHelper(root, node);
    }
    private binarySearchTreeNode insertHelper(binarySearchTreeNode root,binarySearchTreeNode node){
        int data = node.data;
        if(root == null){
            root = node;
            return root;
    }
        else if (data < root.data){
            root.left = insertHelper(root.left,node);
        }
        else{
            root.right = insertHelper(root.right,node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(binarySearchTreeNode root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(binarySearchTreeNode root,int data){
        if(root == null){
            return false;
        }
        else if(root.data == data){
            return true;
        }
        else if(root.data > data){
            return searchHelper(root.left,data);
        }
        else{
            return searchHelper(root.right,data);
        }
    }
    public void remove(int data){

        if(search (data)){
            removeHelper(root,data);
        }
        else{
            System.out.println(data + "could not be found");
        }
    }
    public binarySearchTreeNode removeHelper(binarySearchTreeNode root,int data){
        if(root == null){
            return root;
        }
        else if(data < root.data){
            root.left = removeHelper(root.left,data);
        }
        else if(data > root.data){
            root.right = removeHelper(root.right,data);
        }
        else{//node found
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.right != null){//find a successor to replace thsi node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else{//find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left , root.data);
            }
        }
        return null;
    }
    private int successor(binarySearchTreeNode root){//find least value below the right child of this root node
        root = root.right;
        while(root.left !=null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(binarySearchTreeNode root){//find the greatest value below the left child of this root node
        root = root.left;
        while(root.right !=null){
            root = root.right;
        }
        return root.data;
    }

    public void inOrder() { inOrderHelper(root); }
    public void preOrder() { preOrderHelper(root); }
    public void postOrder() { postOrderHelper(root); }

    private void inOrderHelper(binarySearchTreeNode root){
        if (root == null) return;
        inOrderHelper(root.left);
        System.out.println(root.data);
        inOrderHelper(root.right);
    }

    private void postOrderHelper(binarySearchTreeNode root){
        if (root == null) return;
        inOrderHelper(root.left);
        inOrderHelper(root.right);
        System.out.println(root.data);
        
    }

    private void preOrderHelper(binarySearchTreeNode root){
        if (root == null) return;
        System.out.println(root.data);
        inOrderHelper(root.left);
        inOrderHelper(root.right);
    }
}
