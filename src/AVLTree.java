class Node {
    int data, height;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.height = 1; 
    }
}

public class AVLTree {
    Node root;

    
    int height(Node n) {
        if (n == null)
            return 0;
        return n.height;
    }

    int getBalance(Node n) {
        if (n == null)
            return 0;
        return height(n.left) - height(n.right);
    }

    Node rightRotate(Node z) {
        Node y = z.left;
        Node T3 = y.right;

        y.right = z;
        z.left = T3;

        z.height = 1 + Math.max(height(z.left), height(z.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    Node leftRotate(Node z) {
        Node y = z.right;
        Node T2 = y.left;

        y.left = z;
        z.right = T2;

        z.height = 1 + Math.max(height(z.left), height(z.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    Node insert(Node node, int data) {
       
        if (node == null)
            return new Node(data);

        if (data < node.data)
            node.left = insert(node.left, data);
        else if (data > node.data)
            node.right = insert(node.right, data);
        else
            return node; 

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        
        if (balance > 1 && data < node.left.data)
            return rightRotate(node);

        if (balance < -1 && data > node.right.data)
            return leftRotate(node);

        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; 
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + "(" + node.height + ") ");
            inOrder(node.right);
        }
    }

    void inOrder() {
        inOrder(root);
        System.out.println();
    }

    void preOrder(Node node) {
        if (node != null) {
            int balance = getBalance(node);
            System.out.println("data: " + node.data + " Height: " + node.height + " BF: " + balance);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void preOrder() {
        preOrder(root);
    }

 
}
