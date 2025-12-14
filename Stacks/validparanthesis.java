import java.util.Stack;

public class validparanthesis {
    public static void main(String[] args){

        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i); 
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            } else {
                if(s.isEmpty()){
                    System.out.println("false");
                    return; 
                }
                if(s.peek()=='('&&ch==')'||s.peek()=='{'&&ch=='}'||s.peek()=='['&&ch==']'){
                    s.pop();
                } else {
                    System.out.println("false");
                    return; 
                }else{
                    System.out.println("false");
                    return;
                }
            }

        }
    }

    
}
