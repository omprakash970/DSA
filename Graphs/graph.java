package Graphs;

import java.util.ArrayList;

public class graph {
    static class Edge{
        int src; 
        int dest; 
        int w;
        public Edge(int s, int d, int w){
            this.src=s; 
            this.dest=d; 
            this.w=w;
        }
    }
    public static void main(String[] args){

        int V=5;
        ArrayList<Edge>[]graph=new  ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]= new ArrayList<>();

        }
        // Build a simple undirected, weighted graph
        addUndirectedEdge(graph, 0, 1, 5);
        addUndirectedEdge(graph, 1, 2, 1);
        addUndirectedEdge(graph, 2, 3, 3);
        addUndirectedEdge(graph, 3, 4, 2);

        // Print adjacency lists
        printGraph(graph);

    }

    // Helper: add edge in both directions for undirected graph
    static void addUndirectedEdge(ArrayList<Edge>[] graph, int src, int dest, int w) {
        graph[src].add(new Edge(src, dest, w));
        graph[dest].add(new Edge(dest, src, w));
    }

    // Helper: print adjacency list
    static void printGraph(ArrayList<Edge>[] graph){
        for(int v=0; v<graph.length; v++){
            System.out.print(v + " -> ");
            ArrayList<Edge> edges = graph[v];
            for(int i=0; i<edges.size(); i++){
                Edge e = edges.get(i);
                System.out.print("(" + e.dest + ", w=" + e.w + ") ");
            }
            System.out.println();
        }
    }
}
    
