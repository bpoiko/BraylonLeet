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
        while(left < right){
            while(right < s.length()){
                
                if(charFreq.getOrDefault(s.charAt(right),0) >= 1){
                //nice
               // secFreq.put(s.charAt)
            
            }

            }
            //left really shouldnt move until right bumps into a match
            //
          

            right++;

        }
        // once all characters found exit and return string..
        

      return s.substring(left,right);
    }
}