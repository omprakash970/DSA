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
        System.out.println(list.get(0));
        //remove element: 
        list.remove(1);
        System.out.println(list);
        //set element
        list.set(0, 5);
        System.out.println(list);
        //contains element 
        System.out.println(list.contains(3));
        //size
        System.out.println(list.size());
        //reverse
        System.out.println(list.reversed());
        //find maximum 
       int max=Integer.MIN_VALUE;
       for(int i=0;i<list.size();i++){
        if(list.get(i)>max){
            max=list.get(i);
        }
       }
    }

}

