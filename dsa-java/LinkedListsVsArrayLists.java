import java.util.ArrayList;
import java.util.LinkedList;
public class LinkedListsVsArrayLists {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0 ; i < 1000000; i ++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        //*******************linkedlist*******************
        startTime = System.nanoTime();

        // linkedList.get(0);
        // linkedList.get(500000);// Accessing the middle element to show the difference in time complexity
        // linkedList.get(999999);// Accessing the last element to show the difference in time complexity
        linkedList.remove(0); // Removing the first element to show the difference in time complexity

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList elapsed time: " + elapsedTime + " nanoseconds");

        //*******************ArrayList*******************
        startTime = System.nanoTime();

        // arrayList.get(0);
        // arrayList.get(500000);// Accessing the middle element to show the difference in time complexity 
        // arrayList.get(999999);// Accessing the last element to show the difference in time complexity
        arrayList.remove(0); // Removing the first element to show the difference in time complexity

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        
        System.out.println("ArrayList elapsed time: " + elapsedTime + " nanoseconds");
    }
    
}
