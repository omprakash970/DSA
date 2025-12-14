package Stacks;

import java.util.Stack;

public class validparanthesis {
    public static void main(String[] args) {
        String str = "(())"; // Example input
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    System.out.println("false");
                    return;
                }
                
                if ((s.peek() == '(' && ch == ')') || 
                    (s.peek() == '{' && ch == '}') || 
                    (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    System.out.println("false");
                    return;
                }
            }
        }
        
        if (s.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
