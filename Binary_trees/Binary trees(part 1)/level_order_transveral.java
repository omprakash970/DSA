
public class level_order_transveral {
    public class Node{
        int val; 
        Node left; 
        Node right; 
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    //write a code for level order traversal
    public void levelOrderTraversal(Node root){
        if(root==null){
            return; 
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node currentNode=queue.poll();
            System.out.print(currentNode.val+" ");
            if(currentNode.left!=null){
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null){
                aaaaaaaaaaaaa
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {

    }
}
