public class breadthFirstSearch {
    
    public static void main(String[] args) {

// BFS explores the graph layer by layer, visiting all neighbors first.
// It uses a Queue (FIFO) to track which nodes to visit next.
// A visited array prevents cycles and re-visiting the same node.
// It is the standard algorithm for finding the shortest path in unweighted graphs.

        breadthFirstSearchGraph graph = new breadthFirstSearchGraph(5);

        graph.addNode(new breadthFirstSearchNode("A"));
        graph.addNode(new breadthFirstSearchNode("B"));
        graph.addNode(new breadthFirstSearchNode("C"));
        graph.addNode(new breadthFirstSearchNode("D"));
        graph.addNode(new breadthFirstSearchNode("E"));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        System.out.println("Graph Adjacency Matrix:");
        graph.print();

        System.out.println("\nStarting Breadth First Search at node A:");
        graph.breadthFirstSearch(0);
    }
}
