//Friend Pairing Problem:
// Given N friends, each one can remain single or can be paired up with some other friend. 
// Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.


public class problem3 {
    static int friendPairing(int n){
        //base condition: when there is 1 or 0 friend there is only one way to remain single
        if(n==1||n==0||n==2){
            return n; 
        }
        //single case
        int single=friendPairing(n-1);
        //pairing case
        int pair=(n-1)*friendPairing(n-2); 
        int totalWays=single+pair;
        return totalWays; 


    }
    
    public static void main(String [] args){
        int n=3; //number of friends
        System.out.println(friendPairing(n));
    }
}
