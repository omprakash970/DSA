public class mergesort {
    public static class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data; 
            this.next=null; 
        }
    }
    public Node findMid(Node head){
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
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1); 
        Node temp=mergedLL;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1; 
                head1=head1.next;
                temp=temp.next; 
            }else{
                temp.next=head2; 
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1; 
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){

            temp.next=head2; 
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        if(head==null||head.next==null){
            return head; 
        }
        //find mid
        Node mid=findMid(head); 

        //split into left and right
        Node rightHead = mid.next;
        mid.next = null;
        Node leftHead = head;

        //left & right MS
        Node leftSorted = mergeSort(leftHead); 
        Node rightSorted = mergeSort(rightHead); 

        //Merge
        return merge(leftSorted, rightSorted); 
    }
    public static void main(String[] args) {
        mergesort list = new mergesort();
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        head = list.mergeSort(head);

        // Print sorted linked list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        
    }
}
    

