
import java.util.HashMap;
import java.util.Map;

public class longest_subarray_with_sum_zero {
    static int longestSubarrayWithSumZero(int[] arr) {
        Map<Integer, Integer> firstIndex = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = Math.max(maxLength, i + 1);
            }

            if (firstIndex.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - firstIndex.get(sum));
            } else {
                firstIndex.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(longestSubarrayWithSumZero(arr));
    }
}
