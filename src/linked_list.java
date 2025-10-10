
 class  Node {
  int data;
  Node next;
  public Node(int data){
    this.data=data;
    next=null;
  }
    
}

public class linked_list {
    Node head;
  void Append(int item){
    Node newNode =new Node(item);
    if(head ==null){
      head=newNode;
      newNode.next=null;
    }
    Node currentNode=head;
    while ( currentNode.next!=null) {
        currentNode=currentNode.next;
    }

    currentNode.next=newNode;
    newNode.next=null;
  }

  void Travese(){
    Node currentNode=head;
    while (currentNode!=null) {
        System.out.println(currentNode.data+">");
        currentNode=currentNode.next;
    }
  }
  void insertFirst(int item){
    Node newNode=new Node(item);
    newNode.next=head;
    head=newNode;
  }

  void insertAtPositin(int item,int pos){
    Node newNode=new Node(item);
    if(pos==0){
         insertFirst(item);
         return;
    }
    Node currentNode=head;
    int index=0;
    while (currentNode!=null && index<pos-1) {
        currentNode=currentNode.next;
        index++;
    }
    newNode.next=currentNode.next;
    currentNode.next=newNode;
  }

  void delete(int item){
    if(head==null)return;
    if(head.data==item){
      head=head.next;
      return;
    }
    Node currNode=head;
    while (currNode.next!=null) {
      if(currNode.next.data==item){
        currNode.next=currNode.next.next;
        return;
      }
      currNode=currNode.next;
    }
  }

  void merge(linked_list list2){
if(head==null){
  head=list2.head;
}
Node currNode=head;
while (currNode.next!=null) {
  currNode=currNode.next;
}

currNode.next=list2.head;
  }

void deletedublicat(){
     Node currNode=head;
     while (currNode!=null&&currNode.next!=null) {{
      if(currNode.data==currNode.next.data){
        currNode.next=currNode.next.next;
      }else{
        currNode=currNode.next;
      }
     }
      
     }

}

}
