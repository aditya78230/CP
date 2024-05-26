//PROGRAM FOR TRAVELLING SALES PERSON PROBLEM

import java.util.*;

public class TSPNearestNeighbor {
    private int numberOfNodes;
    private Stack<Integer> stack;

    public TSPNearestNeighbor() {
        stack = new Stack<>();
    }

    public void tsp(int adjacencyMatrix[][]) {
        numberOfNodes = adjacencyMatrix[0].length;
        int[] visited = new int[numberOfNodes];
        visited[0] = 1;
        stack.push(0);
        int element, dst = 0, i;
        int min = Integer.MAX_VALUE;
        boolean minFlag = false;
        System.out.print(0 + "\t");

        while (!stack.isEmpty()) {
            element = stack.peek();
            i = 0;
            min = Integer.MAX_VALUE;
            while (i < numberOfNodes) {
                if (adjacencyMatrix[element][i] > 1 && visited[i] == 0) {
                    if (min > adjacencyMatrix[element][i]) {
                        min = adjacencyMatrix[element][i];
                        dst = i;
                        minFlag = true;
                    }
                }
                i++;
            }
            if (minFlag) {
                visited[dst] = 1;
                stack.push(dst);
                System.out.print(dst + "\t");
                minFlag = false;
                continue;
            }
            stack.pop();
        }
    }

    public static void main(String... arg) {
        int number_of_nodes;
        Scanner scanner = null;
        int adjacency_matrix[][];

        try {
            System.out.println("Enter the number of nodes in the graph");
            scanner = new Scanner(System.in);
            number_of_nodes = scanner.nextInt();
            adjacency_matrix = new int[number_of_nodes][number_of_nodes];

            System.out.println("Enter the adjacency matrix");
            for (int i = 0; i < number_of_nodes; i++) {
                for (int j = 0; j < number_of_nodes; j++) {
                    adjacency_matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("The cities are visited as follows");
            TSPNearestNeighbor tspNearestNeighbor = new TSPNearestNeighbor();
            tspNearestNeighbor.tsp(adjacency_matrix);

        } catch (InputMismatchException inputMismatch) {
            System.out.println("Wrong Input Format");
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}

// OUTPUT : 
// The cities are visited as follows
// 0	2	1	3