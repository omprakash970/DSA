package Stacks;

import java.util.ArrayList;

public class stack {
    public static class  stacka{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolen isEmpty(){
            return list.size()==0;
        }
        public void push(int data){
            list.add(data); 
        }
        public static int pop(){
            if(isEmpty()){
                return -1; 
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

    }
    
}
