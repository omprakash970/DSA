
package Strings;

import java.util.Scanner;


public class io {
    public static int getshortestLength(String path){
        int x=0, y=0; 
        for(int i=0;i<path.length(); i++){
            char dir=path.charAt(i); 
            if(dir=='N'){
                y++; 
            }
            else if(dir=='S'){
                y--; 
            }
            else if(dir=='E'){
                x++; 
            }
            else{
                x--; 
            }       

        }
        return Math.abs(x)+Math.abs(y);
    }
         //check if it is a palindrome 
    public static boolean  isPalindrome(String str){
        int n=str.length(); 
        for(int i =0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;  
            }
            else{
                return true; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name; 
        // //input method
        // name=sc.nextLine(); 
        // System.out.println(name);
        // String firstname="Om Prakash"; 
        // String lastname=" Bandi"; 
        // //concatination method
        // String fullname=firstname.concat(lastname);
        // System.out.println(fullname);
        // System.out.println(fullname.length());
        //String Atmethod
        String name1="Om Prakash Bandi";
        char First_char=name1.charAt(0); 
        System.out.println(First_char);
   //substring

   //
        String substr=name1.substring(4,10);
        System.out.println(substr);
               
    }
    
}
