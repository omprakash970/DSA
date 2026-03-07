//reverse a String using Stack 
import java.util.*;

public class question2 {
public String reverseString(String str){
    Stack<Character>s = new Stack<>();
    for(int i=0;i<str.length();i++){
        s.push(str.charAt(i));
    }
    StringBuilder sb = new StringBuilder("");
    while(!s.isEmpty()){
        sb.append(s.pop());
    }
    return sb.toString();
}


    public static void main(String[] args) {
        question2 q = new question2();
        String str = "Hello World";
        String reversed = q.reverseString(str);
        System.out.println(reversed);
    }
}
    
