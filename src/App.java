public class App {
    public static void main(String[] args) throws Exception {

        BST tree=new BST();
        tree.insert( 5);
        tree.insert( 2);
        tree.insert( 6);
        tree.insert( 7);
        tree.insert( 1);
       System.err.println(tree.search(5));
       tree.delete(tree.root, 6);
       tree.preOrder(tree.root);
    }
}
