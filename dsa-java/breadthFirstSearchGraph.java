import java.util.*;

public class breadthFirstSearchGraph {
    
    int[][] matrix;
    ArrayList<breadthFirstSearchNode> nodes; 

    breadthFirstSearchGraph(int size) {
        matrix = new int[size][size];
        nodes = new ArrayList<>(); 
    }

    public void addNode(breadthFirstSearchNode node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public void print() {
        System.out.print("  ");
        for (breadthFirstSearchNode node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    } // Added missing brace here

    public void breadthFirstSearch(int src) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(!queue.isEmpty()) {
            src = queue.poll();
            System.out.println(nodes.get(src).data + " = visited");

            for(int i = 0; i < matrix[src].length; i++) {
                if(matrix[src][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i); 
                }
            }
        }
    }
}
