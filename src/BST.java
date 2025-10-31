class  Node {
int data;
Node left,right;
Node(int data){
    this.data=data;
    left=right=null;
}
    
}
public class BST {
   Node root;
  BST(){
    root=null;
  }

  Node insert(Node r,int item){
   if(r==null){
    Node newNode=new Node(item);
    r=newNode;
   }else if(item<r.data){
    r.left=insert(r.left, item);
   }else{
    r.right=insert(r.right, item);
   }
   return r;
  }
  void insert(int item){
   root=insert(root,item);
  }
  
  void preOrder(Node r){
    if(r==null){
    return;
    }
    System.out.println(r.data);
    preOrder(r.left);
    preOrder(r.right);
  }
 void inOrder(Node r){
    if(r==null)return;

    inOrder(r.left);
    System.err.println(r.data);
    inOrder(r.right);
 }
 void postOrder(Node r){
        if(r==null)return;
   postOrder(r.left);
   postOrder(r.right);
   System.out.println(r.data);

 }
Node findMin(Node r){
  if(r==null)return null;
  else if(r.left==null ){
  return r;
  }
else 
return findMin(r.left);
}
   Node findMax(Node r){
      if(r==null)return null;
     else if(r.right==null){
        return r;
     }else{
        return findMax(r.right);
     }
   }

}
