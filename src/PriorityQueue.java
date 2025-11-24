public class PriorityQueue {
  int [] priQ;
  int size;
  int nItems;

  PriorityQueue(int size){
this.size=size;
priQ=new int[size];
nItems=0;
  }
  public void enQueue(int item){
    if(isFull()) 
    {
        System.out.println("PQ is full");
        return;
    }
    if(nItems==0){
        priQ[nItems]=item;
        nItems++;
    }else{
        int i;
        for( i=nItems-1;i>=0;i--){
            if(item<priQ[i]){
                priQ[i+1]=priQ[i];
            }else{
                break;
            }
        }
        priQ[i+1]=item;
        nItems++;
    }
  }

  public int deQueue(){
    if(nItems==0){
        System.out.println("priQ is empty");
        return -1;
    }

    return priQ[--nItems];
  }

//   public void deQueue(){
//     if(nItems==0){
//         System.out.println("priQ is empty");
       
//     }
//     nItems--;
//   }


public void display(){
    if(isEmpty()){
        System.out.println("pq is empty");
        return;
    }
    for(int i=0;i<nItems;i++){
        System.out.println(priQ[i]);
    }
    System.err.println();
}

public boolean isEmpty(){
    return nItems==0;
}
public boolean isFull(){
    return nItems==size;
}
public int peek(){
    return priQ[nItems-1];
}
}
