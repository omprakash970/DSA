package Arrays;

public class kandanes {
    public static void kandanes(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0; 
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(arr[i]<0){
                currSum=0; 
            }
            maxSum=Math.max(maxSum, currSum);
        }
        
    }
    
}
