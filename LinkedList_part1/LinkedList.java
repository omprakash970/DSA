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
    public void addLast(int data){
         Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.print("Linked List is empty");
            return;
        }
        Node temp=head; 
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
    }
    public void add(int index, int data){
        Node newNode=new Node(data); 
        if(index==0){
            addFirst(data);
            return;
        }
        Node temp=head; 
        for(int i=0;i<index-1; i++){
            temp=temp.next; 
        }
        newNode.next=temp.next;
        temp.next=newNode;



    }

    public void palindrome(){
        
    }
    public static void main(String[] args) {
     LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(40);
        ll.add(0, 25);
        ll.print();


        
    }   

    
}
