
import java.util.HashMap;

public class longest_subarray_with_sum_zero {
    static int longestSubarrayWithSumZero(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length=0; 
        int sum=0; 
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                length=Math.max(length, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return length;

    }

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(longestSubarrayWithSumZero(arr));
    }
}
