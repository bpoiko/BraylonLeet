
class primi{
    private static long add(long a, long b){
        return b == 0 ? a : add(a ^ b, (a & b) << 1);
    }
    public long primiativeMul(long a, long b){
        long sum = 0;
        while( a != 0){
            if((a & 1) != 0){
                 sum = add(sum,b);
            }
            a >>>= 1;
            b <<= 1;
        }
           return sum;  
    } //bitwise multi
 

    public static void main(String[] args) {
        
    }
}