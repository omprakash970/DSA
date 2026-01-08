public class count_nodes {
    class  Node{
        int data; 
        Node left;
        Node right; 
        Node(int data){
            this.data=data; 
            this.right=null;
            this.left=null;
        }
    }
    static class BinaryTree{
       static int idx=-1;
       public static Node buildTree(int nodes[]){
        idx++;; 
        if(nodes[idx]==-1){
            return null; 
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode; 
       }

       public static int countNodes(Node root){
        if(root==null){
            return 0; 
        }
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);
        return leftNodes+rightNodes+1;
       }
    }
    
}
