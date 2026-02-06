package Heap;

import java.util.PriorityQueue;

public class intro {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5); 
        pq.add(4); 
        pq.add(1);
        pq.add(7); 
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            
            pq.remove();
        }

    }
}
    

