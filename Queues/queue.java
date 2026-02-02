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
             front=-1;
        }
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear + 1) % size == front;
        }

        public void add(int data){
            if (isFull()){
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()){
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % size;
            }
            arr[rear] = data;
        }

        public int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            if (front == rear){
                // queue becomes empty after removal
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return val;
        }

        public int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        }

    }
    
