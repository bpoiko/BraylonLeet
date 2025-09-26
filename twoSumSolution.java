import java.util.*;

public class twoSumSolution{

    public int[] twoSum(int nums[], int target){
        Map<Integer,Integer> hi = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(hi.containsKey(target-num)){
                return new int[] {i, hi.get(target-num)};
            }
            hi.put(num, i);
        }
        return new int[] {};
    }
   
}
