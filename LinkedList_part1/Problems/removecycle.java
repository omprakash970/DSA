public class removecycle {
     public static class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data;
            this.next=null;
        }
     }
     public static Node head;
     public static void removeCycle(){
        Node slow=head; 
        Node fast =head; 
        boolean cycle=0; 
        while(fast!=null&&fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next; 
            if(fast==slow){
                cycle=1; 
                break;
            }
        }
        if(!cycle){
            return; 
        }
        slow=head; 
        while(slow!=fast){
            prev=fast; 
            slow=slow.next; 
            fast=fast.next; 
        }
        prev.next=null; 
     }


    public static void main(String[] args){


        
    }
}
