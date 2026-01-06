package problems;

import java.util.HashMap;

public class valid_anagram {
    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> Map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            Map.put(ch, Map.getOrDefault(ch, 0)+1);


        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(Map.get(ch)!=null){
                if(Map.get(ch)==1){
                    Map.remove(ch);
                }else{
                    Map.put(ch, Map.get(ch)-1);
                }else{
                    return false;
                }
            }
        }
        return Map.isEmpty();
    }

    public static void main(String[] args) {


    }
    
}
