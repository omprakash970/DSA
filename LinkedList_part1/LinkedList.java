package LinkedList_part1;

public class LinkedList {
    public static class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data; 
            this.next=null;
        }
    }
    public static Node head; 
    public static Node tail; 


    public void addFirst(int data){
        Node newNode = new Node(data); 
        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head ;
        head=newNode;
    }


    public static void main(String[] args) {
     LinkedList ll=new LinkedList();
        ll.head =new Node(1);
        ll.head.next=new Node(2);
        ll.head.next.next=new Node(3);
        ll.head.next.next.next=new Node(4);
        
    }   

    
}
