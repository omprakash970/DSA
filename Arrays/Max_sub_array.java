package Arrays;

public class Max_sub_array {
    public static void maxSubArray(int arr[]){
       
         int maxSum=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
         }
         System.out.println("Maximum Subarray Sum is: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(arr);
    }
}
