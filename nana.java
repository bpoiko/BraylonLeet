import java.util.*;

class Solution{
    public int minEatingSpeed(int[] piles, int h){
        int l = 0;
        int r = Arrays.stream(piles).max().getAsInt(); // largest value in piles
        int res = r; // starting point for our answer
        while(l <= r){
            int k = (l+r) / 2;
            long totalTime = 0;
            for(int nana : piles){
                totalTime += (int) Math.ceil((double) nana / k); 
                //time to finish pile with current eating speed
            }
            if(totalTime <= h){
                res = k; // found a new eating speed could be best but we don't know
                r = k -1; 
            }else{
                // too slow, need a higher speed
                l = k + 1;
            }
        }
        return res;
    }
}

public class nana{

}