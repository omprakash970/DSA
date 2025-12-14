package Stacks;
import java.util.Stack;

public class duplicates {
    public static boolean checkDuplicates(String str) {
        Stack<Character> s = new Stack<>(); 
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if(ch == ')') {
                int count = 0; 
                while(s.peek() != '(') {
                    s.pop(); 
                    count++;
                }
                if(count < 1) {
                    return true; 
                } else {
                    s.pop(); 
                }
            } else {
                s.push(ch); 
            }
        }
        return false;
    }
}
