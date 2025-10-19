
class minCostSol{
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(costFind(cost,0), costFind(cost,1)); //. because we are given the option to start at 0 or 1
    }
    public int costFind(int[]b1,int i ){
        if(i >= b1.length){
            return 0;
        }
        // handle the sub problems of if we moved one step, or the cost if we moved two steps
        return b1[i] + Math.min(costFind(b1,i+1),costFind(b1,i+2));
    }
}
public class spiderweb{
    //HELLO!
}