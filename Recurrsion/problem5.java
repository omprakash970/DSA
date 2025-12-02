import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Problem:
 Given an integer array of size N, find all occurrences (indices) of a given element (key)
 and print them. Solve this using a recursive function.

 This file: problem5.java
 Usage (stdin):
    - First integer: N (size of array)
    - Next N integers: array elements
    - Last integer: key to search for
 Example:
    Input:
        6
        1 2 3 2 4 2
        2
    Output:
        1 3 5
*/

public class problem5{
    public static void FindAllOccurrences(int [] arr, int key, int idx, List<Integer> occurrences){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            occurrences.add(idx);
        }
        FindAllOccurrences(arr, key, idx + 1, occurrences);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        List<Integer> occurrences=new ArrayList<>();
        FindAllOccurrences(arr, key, 0, occurrences);
        for(int index: occurrences){
            System.out.print(index+" ");
        }
        sc.close();
    }
}

