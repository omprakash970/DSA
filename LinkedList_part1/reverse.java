class reverse {
    class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data; 
            this.next=null; 
        }
    }
    public Node head;
   public void reverse(){
    Node prev=null; 
    Node curr=head; 
    Node next; 
    while(curr!=null){
        next=curr.next; 
        curr.next=prev; 
        prev=curr;
        curr=next; 
    }

   }

    public static void main(String[] args){
        reverse ll=new reverse(); 
        ll.head=ll.new Node(1);
        ll.head.next=ll.new Node(2);
        ll.head.next.next=ll.new Node(3);
        ll.head.next.next.next=ll.new Node(4);
        ll.head.next.next.next.next=ll.new Node(5);

        ll.reverse();
        Node temp=ll.head; 
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next; 
        }
  
    }
    
}
