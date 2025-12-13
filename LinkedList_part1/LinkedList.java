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

    public Node FindMid(Node head){
        Node slow =head; 
        Node fast =head; 
        while(fast!=null&&fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next;
        }
        return slow; 
    }
    public boolean checkPalindrome(){
        //step-1: find middle 
        Node mid=FindMid(head);
        //step-2: reverse 2nd half 
        Node prev =null; 
        Node curr=mid;
        Node next; 
        while(curr!=null){
            next=curr.next; 
            curr.next=prev; 
            prev=curr; 
            curr=next;
        }
        //step-3: compare both halves
        Node right =prev; 
        Node left=head; 
        while(right!=null){
            if(left.data!=right.data){
                return false; 
            }
            left=left.next;
            right=right.next;
        }

        return true;
        
    }

 //floyd's cycle detection algorithm
    public Node mergeSort(Node head){
        //base case
        if(head==null || head.next==null){
            return head; 
        }   


        //find mid 
        Node mid=FindMid(head); 
        //left & right MS
        Node rightHead=mid.next; 
        mid.next=null;
       
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //Merge

        return mergeSort(newLeft, newRight);
        
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
