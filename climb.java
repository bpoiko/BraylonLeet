
class cell{
    public int climbStairs(int n){
        return dfs(n,0);
    }
    public int dfs(int n, int i){
        if(i >= n){
            return i == n ? 1 : 0;
        }
        return dfs(n, i +1) + dfs(n, i + 2);
    }
}
public class climb{
    public static void main(String[] args) {
        IO.print("Check out this new feature introduced in the newest Java version! no more lengthy prints");
    }
}