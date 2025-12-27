package LinkedList_part1;

public class zigzagll {
    public static class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data; 
            this.next=null; 
        }
    }
    public static void findMid(Node head){
        if(head==null || head.next==null){
            return head; 
        }
        Node slow=head; 
        Node fast=head.next; 

        while(fast!=null&&fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next; 
        }
        return slow; 
    }

    public void zigzag(){
        //find mid
        Node mid=findMid(head);

        //reverse 2nd half
        Node curr=mid.next; 
        Node prev=null; 
        Node next; 
        while(curr!=null){
            next=curr.next; 
            curr.next=prev; 
            prev=curr; 
            curr=next;
        }
       Node left=head; 
       Node right=prev; 
       Node nextL, nextR; 
       

        //alt merge-zigzag merge
        while(next!=null && right!=null){
            nextL=left.next; 
            left.next=right; 
            nextR=right.next; 
            right.next=nextL; 

            left=nextL; 
            right=nextR;
            
        }
    }



        public static void main(String[] args){


        }
    
}
