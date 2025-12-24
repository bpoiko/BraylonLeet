class countbits{


    public static short countBits(int x){
    short numBits = 0;
    while(x != 0){
        numBits += (x & 1); // last bit on the right

        x >>>= 1; // throws away last bit, and brings the next bit 
    }

    return numBits;
}
}
