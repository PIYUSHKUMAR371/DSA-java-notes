
import java.util.*;

public class adjacencyMatrixGraph {
    
    int[][] matrix;
    ArrayList<adjacencyMatrixNode> nodes; // Just declare it here

    adjacencyMatrixGraph(int size) {
        matrix = new int[size][size];
        nodes = new ArrayList<>(); // Initialize here
    }

    public void addNode(adjacencyMatrixNode node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
       matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1; // Cleaner way to write if/else
    }

    public void print() {
        // 1. Print the top header labels
        System.out.print("  ");
        for(adjacencyMatrixNode node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        // 2. Print the rows with side labels
        for(int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " "); // Label for the row
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
