// PROGRAM FOR BFS SEARCHING ALGORITHM

import java.util.*;

public class BFS {
    private int V; 
    private LinkedList<Integer> adjList[];

    @SuppressWarnings("unchecked")
    BFS(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjList[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adjList[v].add(w); // Add w to v's list.
    }

    void BFS(int s) {
        
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
          
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adjList[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("BFS starting from vertex 2:");

        g.BFS(2);
    }
}

// OUTPUT :
// BFS starting from vertex 2:
// 2 0 3 1 
