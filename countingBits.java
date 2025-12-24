
class countingBits{
    class SolutionAgain {
    //helper method to count

    public int counter(int n){
        int numBits = 0;
        while(n != 0){
            numBits += (n & 1);

            n >>>= 1;
        }
        return numBits;
    }

    public int[] countBits(int n) {
        int[] sol = new int[n+1]; // need to include zero

        for(int i = 0; i <= n; i++){ // range [0,n]
            sol[i] = counter(i);
        }
        return sol;

    }
}

}