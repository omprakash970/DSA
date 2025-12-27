public class mergesort {
    public static class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data; 
            this.next=null; 
        }
    }
    public void findMid(Node head){
        Node slow=head; 
        Node fast=head.next; 

        while(fast!=null&&fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next; 
        }
        return slow; 
    }
    public Node mergeSort(Node head){
        //find mid
        Node mid=findMid(head); 

        //left & right MS
        Node rightHead=mergeSort(head); 
        mergeSort(rightHead); 


        //Merge
    }
    public static void main(String[] args) {
        
    }
}
    

