import java.util.*; 

public class levelorder_taversal {
    public static class Node{
        int data; 
        Node left; 
        Node right; 
        Node(int data){
            this.data=data; 
            this.left=null; 
            this.right=null;
        }
    }
    public static void levelorder(Node root){
        if(root==null){
            return; 
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        

    }
}
