//remove duplicates from a string using recursion

public class problem2 {
    public static void removeDuplicates(String str, int idx, StringBuilder newstr, boolean [] map){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar=str.charAt(idx); 
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx, newstr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }

    }
    public static void main(String [] args){
        String str="omprakash"; 
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }


    
}
