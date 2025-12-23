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
    public class diameter(){
        int diameter; 
        public int diameterofBinaryTree(Node root){
            diameter=0; 
            height(root);
            return diameter;
        }
        public int height(Node root){
            if(root==null){
                return 0; 
            }
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            diameter=Math.max(diameter, leftheight+rightheight);
            return Math.max(leftheight, rightheight)+1;
            
            
        }
    }
    public static void main(String[] args){
        System.out.println("Diameter of binary tree");
        
    }
    
}
