import java.util.Arrays;
import java.util.Comparator;


public class max_len_chain_of_pairs {
    public static void main(String[] args) {
        int[][] pairs={{5,24},{15,25},{27,40},{50,60}};

         Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
         int ChainLen=1; 
         int ChainEnd=pairs[0][1];
         for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>ChainEnd){
                ChainLen++; 
                ChainEnd=pairs[i][1]; 
            }
         }
        System.out.println(ChainLen);
    }

}
    

