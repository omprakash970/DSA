public class diameter {
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
    public static int diameter(Node root){
        if(root==null){
            return 0; 
        }
        int leftSum=diameter(root.left); 
        int rightSum=diameter(root.right);
        int selfDiameter=leftSum+rightSum+1;
        return Math.max(selfDiameter, Math.max(leftSum, rightSum));
    }
    public static void main(String[] args){
        System.out.println("Diameter of binary tree");
    }
    
}
