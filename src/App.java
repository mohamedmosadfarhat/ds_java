public class App {
    public static void main(String[] args) {
      int[] arr ={5,2,6,3,7,1};
      bubbleSort(arr);
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+"");
      }
    }
                                          // 0 1 2 3 4
    static void selectionSort(int [] arr){// 1 2 3 5 7
       int minIndx;
        for(int i=0;i<arr.length-1;i++){//i=3
           minIndx=i;//4
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[minIndx]){
                minIndx=j;
               }
            }
             if(minIndx !=i){
             int temp=arr[minIndx];
             arr[minIndx]=arr[i];
             arr[i]=temp;
             }
           
        }

    }
                                      // 0 1 2 3 4
    static void bubbleSort(int[] arr){// 1 2 3 5 7
       for(int i=0;i<arr.length;i++){//0
        boolean swapped=false;
          for(int j=0;j<arr.length-i-1;j++){//2
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
          }
          if (swapped==false) break;
       }
    }
}