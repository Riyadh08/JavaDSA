
import java.util.PriorityQueue;


public class PriorityQueue1 {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }

}