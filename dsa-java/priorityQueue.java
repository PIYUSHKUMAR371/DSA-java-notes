import java.util.*;

public class priorityQueue {
    
    //Priority queue = a FIFO data structure that serves elements with the highest priority first
    //                if elements have the same priority, they are served in the order they were added to the queue
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //we can also write it in 
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //which will make the priority queue serve the lowest priority first
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        System.out.println("Priority Queue: " + pq);

        System.out.println("Peek: " + pq.peek());

        System.out.println("Poll: " + pq.poll());
        System.out.println("Priority Queue after poll: " + pq);
    }
}
