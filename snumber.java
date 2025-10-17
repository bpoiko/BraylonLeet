import java.util.*;

class Sol{
    public int singleNumber(int nums[]){
        int sol = 0;
        for(int num : nums){
            sol ^= num;
        }
        return sol;
    }
}
public class snumber{

}