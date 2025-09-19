public class Array {
    int[] items;
    int count;

    Array(int size){
       items = new int[size];
       count=0;
    }

    void Append(int item){
      if(count == items.length){
        System.err.println("array is full");
        return;
      }
        items[count]=item;
        count++;
    }

     void Travese(){
        for(int i=0;i<items.length;i++){
            System.err.println(items[i]);
        }
     }


     boolean s(int item){
       for(int i=0;i<items.length;i++){
        if(items[i]==item){
            return true;
        }
       }
       return false;
     }

     void insert(int pos,int item){
        if(count==items.length){
        System.err.println("array is full");
        return;
        }
       for(int i=count;i>pos;i--){
        items[i]=items[i-1];
       }
       items[pos]=item;
       count++;
     }

     void delete(int pos){
        for (int i=pos;i<count-1;i++){
            items[i]=items[i+1];
        }
        count--;
     }
}
