import java.util.*;
class integef{

    public static boolean IsNumPal(int x){
        if(x <= 0){
            return x == 0;
        }
        final int numDigits = (int) (Math.floor(Math.log(x))) + 1; // number of digits being extracted
        int msdMask = (int) Math.pow(10,numDigits-1);
        for(int i = 0; i < (numDigits / 2); i++){
            if(x / msdMask != x % 10){
                return false;
            }
            x %= msdMask; //remove msd of x
            x /= 10; // remove lsd of x
            msdMask /= 100;
        }
        return true;
       
    }

    public static void evenOdd(List<Integer> A){
        int nextEven = 0, nextOdd = A.size() - 1;
        while(nextEven < nextOdd){
            if(A.get(nextEven) % 2 == 0){
                nextEven++;
            }else{
                Collections.swap(A,nextEven,nextOdd--);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}