
import java.util.HashSet;
import java.util.Iterator;

public class iterator {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("China");
        set.add("USA");
        set.add("Indonesia");
        Iterator<String> it = set.iterator();
        while(it.hasNext()) { 
            System.out.println(it.next());
        }
        
    }
    
}
