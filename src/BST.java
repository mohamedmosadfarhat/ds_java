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
  Node search(Node r,int item){
    if(r==null)return null;
    else if(item==r.data){
        return r;
    }else if(item<r.data){
      return search(r.left, item);
    }else{
       return search(r.right, item);
    }
  }
   boolean search(int item){

   Node res= search(root, item);
   if(res==null) return false;
   else 
   return true;
   }
  
   Node delete(Node r ,int item){
    if(r==null)return null;
    else if(item<r.data){
     r.left= delete(r.left, item);
    }else if(item>r.data){
      r.right=delete(r.right, item);
    }else{
        if(r.left==null&&r.right==null){//leafe node
          r=null;
        }
        else if(r.left!=null&&r.right==null){//one child in left
            r=r.left;
        }else if(r.left==null&&r.right!=null){//one child in right
             r=r.right;
        }else{
           Node max= findMax(r.left);
           r.data=max.data;
         r.left= delete(r.left,max.data);
        }

    }
    return r;
   }


}






