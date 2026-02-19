import java.util.Queue;
import java.util.LinkedList;
public class queue {
    public static void main(String[] args) {


        //Queue = FIFO data structure .First in first out
        //LinkedList is used to implement the Queue interface in Java. It provides methods for adding, removing, and peeking elements in the queue. The LinkedList class allows for efficient insertion and removal of elements at both ends of the list, making it a suitable choice for implementing a queue data structure.
        //queue is a collection designed for holding elemnts prior to processing. It follows the First-In-First-Out (FIFO) principle, where the first element added to the queue is the first one to be removed.
        //Queue is a linear data structure 
        //In Java, you cannot write new Queue<>() because Queue is an interface, not a concrete class. An interface is just a "blueprint" or a contract—it defines what a queue should do (like add, poll, and peek) but doesn't provide the actual code to do it. 


        //add = enqueue,offer()
        //remove = dequeue,poll()
        //peek = element(),peek()


        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(4); // Using offer() to add an element

        // Dequeue elements
        System.out.println("Dequeued: " + queue.poll()); // Outputs 1
        System.out.println("Dequeued: " + queue.poll()); // Outputs 2

        // Check the front element
        System.out.println("Front element: " + queue.peek()); // Outputs 3

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Outputs false

        // Check the size of the queue
        System.out.println("Queue size: " + queue.size()); // Outputs 2


        //Where are queue useful?

        //1.keyboard Buffer (letter should be typed first before it is processed)
        //2.Printer Queue (print jobs should be printed in the order they were received)
        //3.used in LinkedList ,PriorityQueue, ArrayDeque classes and breadth first search algorithm
    }
    
}
