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
        boolean cycle=false; 
        while(fast!=null&&fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next; 
            if(fast==slow){
                cycle=true; 
                break;
            }
        }
        if(!cycle){
            return; 
        }
        //find the meeting point 
        slow=head; 
        Node prev=null; 
        while(slow!=fast){
            prev=fast; 
            slow=slow.next; 
            if(fast==null){
                return; 
            }
            fast=fast.next; 
        }

        //removing the last node of the cycle
        prev.next=null; 
     }


    public static void main(String[] args){
        head = new Node(1); 
        head.next = new Node(2);
        head.next.next = new Node(3);   
        head.next.next.next = head.next; // Creating a cycle for testing
        removeCycle();
        System.out.println(head.data);


        
    }
}
