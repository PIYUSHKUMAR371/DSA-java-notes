public class adjacentList {
    public static void main(String[] args) {
        
    
    //adjacency List = An array/arraylist of linkedlists
    //                 Each LinkedList has a unique node at the head
    //                 All adjacent neighbours to that node are added to that nodes's linkedlist

    //runtime complexity to check an Edge : O(n) where n is the number of adjacent neighbours to that node
    //space complexity : O(V + E) where V is the number of vertices and E

    adjacencyListGraph graph = new adjacencyListGraph();

    graph.addNode(new adjacencyListNode('A'));
    graph.addNode(new adjacencyListNode('B'));
    graph.addNode(new adjacencyListNode('C'));
    graph.addNode(new adjacencyListNode('D'));
    graph.addNode(new adjacencyListNode('E'));

    graph.addEdge(0, 1);
    graph.addEdge(1, 2);
    graph.addEdge(1, 4);
    graph.addEdge(2, 3);
    graph.addEdge(2, 4);
    graph.addEdge(4, 0);
    graph.addEdge(4, 2);

    graph.print();

    }
}
