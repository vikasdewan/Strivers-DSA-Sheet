package Lec3;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    

    public static void main(String[] args) {
        
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }


    public static boolean isIsomorphic(String s , String t){
        if(s.length() != t.length() ) return false;

        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();
         
        for(int i = 0 ;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            //forward mapping
            if(mapST.containsKey(c1)){
                if(mapST.get(c1) != c2) return false;
            }else {
                mapST.put(c1, c2);
            }
          

            //reverse mapping
            if(mapTS.containsKey(c2)){
                if(mapTS.get(c2) != c1) return false;
            }else {
                mapTS.put(c2, c1);
            }
        }
        return true;
    }


      public boolean isIsomorphicOPT(String s, String t) {
        Map<Character, Character> m = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(m.containsKey(c1)){
                //System.out.println(c1 + " " + c2);
                if(m.get(c1) != c2) return false;
            }
            else{
                if(m.containsValue(c2)) return false;
                m.put(c1, c2);
            }
        }

        return true;
    }
}
