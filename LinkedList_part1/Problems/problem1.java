public class problem1 {
    public static class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data; 
            this.next=null;
        }

    }
    public Node getIntersectionNode(Node headA, Node headB){
        while(headB!=null){
            Node temp=headA; 
            while(temp!=null){
                if(temp==headB)
                    return headB;
            }
            temp=temp.next;
        }
        headB=headB.next;

    }

    return null; 
    
}
