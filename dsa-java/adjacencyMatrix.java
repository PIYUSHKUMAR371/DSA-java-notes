

import java.util.*;
public class adjacencyMatrix {
    public static void main(String [] args) {
        //adjacency matrix = a 2D array that represents a graph
        //                   rows = source vertex
        //                   column = destination vertex
        //                   value = weight of edge (0 if no edge)

        //runtime complexity of adjacency matrix
        //O(1) to check if edge exists
        //space complexity = O(v^2) where v is the number of vertices

        adjacencyMatrixGraph graph = new adjacencyMatrixGraph(5);

        graph.addNode(new adjacencyMatrixNode('A'));
        graph.addNode(new adjacencyMatrixNode('B'));
        graph.addNode(new adjacencyMatrixNode('C'));
        graph.addNode(new adjacencyMatrixNode('D'));
        graph.addNode(new adjacencyMatrixNode('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

    }
}
