public class App {
    public static void main(String[] args) {
      PriorityQueue pq=new PriorityQueue(5);
      pq.enQueue(4);
      pq.enQueue(3);
      pq.enQueue(2);
      pq.enQueue(5);

pq.deQueue();
    //  System.out.println(pq.deQueue());
     pq.display();
    }
}