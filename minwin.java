import java.util.*;
class minwin{
    public String minWindow(String s, String t) {
        if(s.equals(t)){
            return s;
        }
        if(t.length() > s.length()){
            return "";
        }
        //build char frequency 
        int required = 0;
        Map<Character, Integer> charFreq = new HashMap<>();
        for(char c :  t.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c,0) + 1);
            required++;
        }
        
        
        int left = 0;
        int right = 1;
        Map<Character,Integer> secFreq = new HashMap<>();
        while(right < s.length()){
            while(left < right){
                
                if(charFreq.getOrDefault(s.charAt(right),0) >= 1){
                //nice
                secFreq.put(s.charAt(right),secFreq.getOrDefault(s.charAt(right), 0)+1);
                
            }
                 right++;
            }
            //left really shouldnt move until right bumps into a match
            //
          


        }
        // once all characters found exit and return string..
        

      return s.substring(left,right);
    }
}