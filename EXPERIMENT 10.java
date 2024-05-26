// PROGRAM TO STUDY BIPARTITE COLOURING GRAPH PROBLEM

import java.util.*;

public class BipartiteGraph {
    private int V; // Number of vertices
    private List<List<Integer>> adjList; // Adjacency list

    public BipartiteGraph(int V) {
        this.V = V;
        adjList = new ArrayList<>(V);
        for (int i = 0; i < V; i++)
            adjList.add(new LinkedList<>());
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adjList.get(v).add(w);
        adjList.get(w).add(v); // For undirected graph
    }

    // Function to check whether the graph is bipartite or not
    boolean isBipartite() {
        // Array to store color of vertices
        // -1: not colored, 0: first color, 1: second color
        int[] color = new int[V];
        Arrays.fill(color, -1);

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                queue.add(i);
                color[i] = 0;

                while (!queue.isEmpty()) {
                    int u = queue.poll();

                    for (int v : adjList.get(u)) {
                        if (color[v] == -1) {
                            color[v] = 1 - color[u];
                            queue.add(v);
                        } else if (color[v] == color[u]) {
                            return false; // Not bipartite
                        }
                    }
                }
            }
        }
        return true; // Bipartite
    }

    public static void main(String[] args) {
        BipartiteGraph g = new BipartiteGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        if (g.isBipartite())
            System.out.println("The graph is bipartite.");
        else
            System.out.println("The graph is not bipartite.");
    }
}

//OUTPUT :
// The graph is bipartite.
// The graph is not bipartite.