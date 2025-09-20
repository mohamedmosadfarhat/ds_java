
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
        System.out.print(currentNode.data+">");
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
}
