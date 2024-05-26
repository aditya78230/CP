// PROGRAM FOR DFS SEARCHING ALGORITHM

import java.util.*;

public class DFS {
    private int V; 
    private LinkedList<Integer> adjList[];

    @SuppressWarnings("unchecked")
    DFS(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjList[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adjList[v].add(w); // Add w to v's list.
    }

    void DFSUtil(int v, boolean visited[]) {

        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {

        boolean visited[] = new boolean[V];

        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("DFS starting from vertex 2:");

        g.DFS(2);
    }
}

// OUTPUT :
// DFS starting from vertex 2:
// 2 0 1 3 