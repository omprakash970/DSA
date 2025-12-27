
public class problem2 {
    public static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }




    public boolean isCycle(){
        Node slow=head; 
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next;
            if(slow==fast){
                return true; 
            }
        }
        return false;
    }
    public static void main(String[] args){
       
        
    }
    
    
}
