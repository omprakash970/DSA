
import java.util.ArrayList;
class usingArrayList{


        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.isEmpty();
        }
        public  void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.remove(list.size()-1);
        }
        public int peek(){
            int top=list.get(list.size()-1);
            return top;
        }
}

