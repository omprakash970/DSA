//Binary Strings Problem: print all binary strings of size N without consecutive 1s.


public class problem4 {
   public static void printBinaryString(int n, int lastPlace, StringBuilder str){
    if(n==0){
         System.out.println(str);
         return;
    }
   printBinaryString(n-1, 0, str.append("0"));
   if(lastPlace==0){
       printBinaryString(n-1, 1, str.append("1"));
   }
    
}
public static void main(String[] args) {


    int n=3; //size of binary string
    printBinaryString(n, 0, new StringBuilder(""));
}


}

