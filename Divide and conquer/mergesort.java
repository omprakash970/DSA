

public class mergesort {
    public static void merge_sort(int arr[], int si, int ei){
        if(si>=ei){
            return; 
        }
        int mid=(si+ei)/2;
        merge_sort(arr[], si, mid);
        merge_sort(arr[], mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){   
            int temp[] = new int[arr.length];
            int i=si;
            int j=mid+1;
            int k=0; 
            while(i<=mid )
    
}
