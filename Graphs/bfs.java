// ...existing code...
// package Graphs;
// ...existing code...
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    static class Edge {
            
        @SuppressWarnings("unused")
        int src;
        int dest;
        @SuppressWarnings("unused")
        int w;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.w = w;
        }
    }

    public static void bfs_transversal(ArrayList<Edge>[] graph, int start, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                if (!visited[e.dest]) {
                    q.add(e.dest);
                    visited[e.dest] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // optional: build graph and call bfs_transversal(...)
    }
}