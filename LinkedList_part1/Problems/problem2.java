
import java.util.LinkedList;

//detect a loop/cycle in a linked list
public class problem2 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
       
        System.out.println(detectLoop(list) ? "Loop detected" : "No loop detected");

        
    }
    
    
}
