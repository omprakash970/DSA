package ArrayList;
import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        //add
        list.add(1); 
        list.add(2);
        list.add(3);
        System.out.println(list);
        //get
        int element= list.get(1); 
        System.out.println(element);
    }

}

