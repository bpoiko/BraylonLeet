class alphanum{
/**
 * Helper method to check if a letter is alphanumerical 
 */
    public boolean alphaNumeric(char c){
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}