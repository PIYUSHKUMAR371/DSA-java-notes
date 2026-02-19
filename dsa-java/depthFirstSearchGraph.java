import java.util.ArrayList;

public class depthFirstSearchGraph {

    ArrayList<depthFirstSearchNode> nodes = new ArrayList<>();
    int[][] matrix;

    public void addNode(depthFirstSearchNode node) {
        nodes.add(node);
        int size = nodes.size();
        int[][] newMatrix = new int[size][size];

        // Copy existing matrix data into the new larger matrix
        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }
        matrix = newMatrix;
    }

    public void addEdge(int i, int j) {
        // Ensure indices are within current bounds
        if (i < matrix.length && j < matrix.length) {
            matrix[i][j] = 1;
            matrix[j][i] = 1; // For an undirected graph
        }
    }

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dfsHelper(src, visited);
    }

    private void dfsHelper(int src, boolean[] visited) {
        if (visited[src]) {
            return;
        }
        
        visited[src] = true;
        System.out.println(nodes.get(src).data + " = visited");

        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dfsHelper(i, visited);
            }
        }
    }

    public void print() {
        System.out.print("  ");
        for (depthFirstSearchNode node : nodes) {
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
    }
}
