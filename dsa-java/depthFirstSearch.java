public class depthFirstSearch {
    
    public static void main(String[] args) {

        //Depth Fist Search = pick a route , keep going.
        //                    If you reach a dead end , or an already visited node,
        //                    backtrack to a previous node with unvisited adjacent neighbours

        depthFirstSearchGraph graph = new depthFirstSearchGraph();

        graph.addNode(new depthFirstSearchNode("A"));
        graph.addNode(new depthFirstSearchNode("B"));
        graph.addNode(new depthFirstSearchNode("C"));
        graph.addNode(new depthFirstSearchNode("D"));
        graph.addNode(new depthFirstSearchNode("E"));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        graph.depthFirstSearch(4);
    }
}
