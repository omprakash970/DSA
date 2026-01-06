
import java.util.HashMap;
public class intro {
    public static void main(String[] args){

        HashMap<String, Integer> Hm= new HashMap<>();
        Hm.put("India", 130);
        Hm.put("China", 150);
        Hm.put("USA", 40);
        int population=Hm.get("India");
        System.out.println(population);
        System.out.println(Hm.get("China"));
        System.out.println(Hm.containsKey("India"));
        Hm.remove("USA");
        System.out.println(Hm.size());
        Hm.clear();
        System.out.print(Hm);

    }
    
}
