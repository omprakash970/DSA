
import java.util.HashMap;
import java.util.LinkedHashMap;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer>Hm = new LinkedHashMap<>();
        Hm.put("India", 100);
        Hm.put("China",150);
        Hm.put("USA", 33);
        Hm.put("Indonesia", 10); 
        HashMap<String, Integer> Hm2= new HashMap<>(Hm);
        Hm2.put("India", 100);
        Hm2.put("China",150);
        Hm2.put("USA", 33);
        Hm2.put("Indonesia", 10);
        System.out.println(Hm);
        System.out.println(Hm2);

    }
    
}
