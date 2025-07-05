package Lec3;

 

public class RotateString {
    
    public static void main(String[] args) {
        
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(isRotateTrue(s, goal));
    }

    public static boolean isRotateTrue(String s , String goal){
        if(s.length() != goal.length()) return false;
         for(int i = 0 ;i<s.length();i++){
            String temp = s.substring(i) + s.substring(0,i);
 
            if(temp.equals(goal)) return true;
         }
         return false;
    }
    
    
    public static boolean isRotateTrueOPT(String s , String goal){
        if(s.length() != goal.length()) return false;
         return (s + s ).contains(goal);
    }
}
