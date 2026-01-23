package Queues;

public class queue {
    static class Queue{
        int arr[]; 
        int size; 
        int rear;
        int front; 
        Queue(int n){
            arr= new int[n];
             size=n; 
             rear=-1;
             front=0;
        }
        public static boolean isEmpty(Queue q){
            return q.rear==-1; 
        }
        public static void add(Queue q, int data){
            if(q.rear==q.size-1){
                System.out.println("Queue is full"); 
                return; 
            }
            q.rear++;
            q.arr[q.rear]=data;
        }
        public static void remove(Queue q){
            if(q.isEmpty(q)){
                System.out.println("Queue is empty"); 
                return; 
            }
            for(int i=0;i<q.rear;i++){
                q.arr[i]=q.arr[i+1]; 
            }
        }

    }
    
}
