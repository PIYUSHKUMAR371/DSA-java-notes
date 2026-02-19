import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {

        //LinkedList = stores Nodes in 2 parts (data + address)
        //             nodes are in non consecutive memory locations
        //             elments are linked using pointers
        
        //                Singly Linked List
        //                  Node1           Node2           Node3
        //             [data|address] -> [data|address] -> [data|null

        //                Doubly Linked List 
        //                  Node1           Node2           Node3
        //             [null|data|address] <-> [address|data|address] <-> [address|data|null]

        //advantages?
        //1.Dynamic data structure (can grow and shrink in size),(allocate needed memory while running)
        //2.Insertion and deletion is easier (no need to shift elements like in an array)
        //no/low memory wastage (allocate only what we need)

        //disadvantages?
        //1 Greater memory usage (extra memory for storing addresses)
        //2 no random access (we have to traverse the list to access an element)
        //3 accessing/searching is slower (O(n) time complexity)

        //uses?
        //1. implementing stacks and queues
        //2. GPS navigation system (doubly linked list can be used to store the path)
        //3. music playlist (doubly linked list can be used to store the songs

    LinkedList<String> linkedlist = new LinkedList<>();
    /* 
    linkedlist.push("A");
    linkedlist.push("B");
    linkedlist.push("C");
    linkedlist.push("D");
    linkedlist.pop();
    */

    //LinkedList as a queue
    linkedlist.offer("A");//here we are using offer instead of add because offer will return false if the linked list is full, whereas add will throw an exception
    linkedlist.offer("B");
    linkedlist.offer("C");
    linkedlist.offer("D");

    linkedlist.add(4,"E");//we can also add an element at a specific index
    linkedlist.remove();//this will remove the first element of the linked list
    linkedlist.remove("E");//this will remove the element "E" from the linked list
    linkedlist.addFirst("F");//this will add the element "F" at the beginning of the linked list
    linkedlist.addLast("G");//this will add the element "G" at the end
    String first = linkedlist.removeFirst();//this will remove the first element of the linked list and return it
    String last = linkedlist.removeLast();//this will remove the last element of the linked list

    System.out.println(linkedlist);
    System.out.println(linkedlist.peekFirst());//this will return the first element of the linked list without removing it
    System.out.println(linkedlist.peekLast());//this will return the last element of the linked list without removing it
    System.out.println(first + " and " + last);
    }
}
