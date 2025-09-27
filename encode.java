import java.util.*;

public class encode{
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
            List<String> decoded = new ArrayList<>();
            int i = 0;
            int j = 0;
            int n = str.length();
            while(i < n){
                j = i;
                while(j < n && Character.isDigit(str.charAt(j))){
                    j++;
                }
                if(j == i){
                    // no digits
                    //uh oh
                    break;
                }
                int len = Integer.parseInt(str.substring(i,j));
                if(j < n && str.charAt(j) == '#' && j+1+len <= n){
                    decoded.add(str.substring(j+1, j+1+len));
                }
                i = j+1+len;
            }

            return decoded;
    }
}