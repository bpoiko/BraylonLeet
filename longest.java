import java.util.*;
public class longest{
    public int longestConsecutive(int[] nums) {
        Set<Integer> numba = new HashSet<>();

        for(int num : nums){
            numba.add(num);
        }

        int longest = 0;
        for(int n : numba){ // n-1 found? consecutive!
            if(!numba.contains(n-1)){
                int length = 1;
                while(numba.contains(n + length)){
                    length++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }

}