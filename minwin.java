import java.util.*;
class minwin{
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        Map<Character, Integer> tCount = new HashMap<>();
        Map<Character,Integer> sNeed = new HashMap<>();

        for(char c : t.toCharArray()){
            tCount.put(c, tCount.getOrDefault(c,0) + 1);
        }
        int resLen = Integer.MAX_VALUE;
        int[] res = {-1,-1};
        int have = 0, need = tCount.size();
        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            sNeed.put(c,sNeed.getOrDefault(c,0) + 1);

            if(tCount.containsKey(c) && tCount.get(c).equals(sNeed.get(c))){
                have++;
            }
            while(have == need){
                if((r - l + 1) < resLen){
                    resLen = r - l + 1; // window size
                    res[0] = l;
                    res[1] = r;
                }

                char leftChar = s.charAt(l);
                sNeed.put(leftChar,sNeed.get(leftChar) - 1); // tighten the window
                if(tCount.containsKey(leftChar) &&  sNeed.get(leftChar) < tCount.get(leftChar)){
                    have--;
                }
                l++;
            } // shrink your window
        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}