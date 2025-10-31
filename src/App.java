public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("java");

        BST tree=new BST();
        tree.insert( 5);
        tree.insert( 2);
        tree.insert( 6);
        tree.insert( 7);
        tree.insert( 1);
    //     System.out.println("preorder");
    //    tree.preOrder(tree.root);
    //     System.out.println("inOrder");

    //    tree.inOrder(tree.root);
    //     System.out.println("postOrder");

    //    tree.postOrder(tree.root);

System.out.println(tree.findMin(tree.root).data); 
System.out.println(tree.findMax(tree.root).data); 
    }
}
