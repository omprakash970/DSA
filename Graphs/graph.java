package Graphs;

import java.util.ArrayList;

public class graph {
    static class Edge{
        int src; 
        int dest; 
        public Edge(int s, int d){
            this.src=s; 
            this.dest=d; 
        }
    }
    public static void main(String[] args){

        int V=5;
        ArrayList<Edge>[]graph=new  ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]= new ArrayList<>();
            
        }

    }
}
    
