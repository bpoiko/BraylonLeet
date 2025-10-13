import java.util.*;
class Solution{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> check = new HashSet<>();
        for(int i = 0; i < nums.length; i++){

            if(i > k){
                check.remove(nums[i-k-1]); // get it out, too far
            } 
            if(!check.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
public class dupestwo{

}