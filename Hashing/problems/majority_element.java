
import java.util.HashMap;

public class majority_element{
    static int majority_element(int arr[]){
      HashMap<Integer, Integer> Map = new HashMap<>();
      for(int i=0;i<arr.length;i++){
        if(Map.containsKey(arr[i])){
            Map.put(arr[i], Map.get(arr[i])+1);
        }else{
            Map.put(arr[i], 1);
        }
        if(Map.get(arr[i]) > arr.length/2){
            return arr[i];
        }   
      
      }
      return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        System.out.println(majority_element(arr));
    }
}
