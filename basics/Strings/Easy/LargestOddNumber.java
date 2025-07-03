package Strings.Easy;

public class LargestOddNumber {
    

    public static void main(String[] args) {
        
    String s = "000123";
    
    System.out.println(largestOddNumString(s));
    }

    public static String largestOddNumString(String s){
        int end = -1;
        int n = s.length();
        for(int i = n-1;i>=0;i--){
            if((s.charAt(i)-'0')%2 != 0){
                end = i;
                break;
            }
        }

        //if no odd digit found.
        if(end == -1) return "";
    
        int start = 0;
        while(start <= end && s.charAt(start) == '0'){
            start++;
        }

        return s.substring(start, end+1);
    } 

     
}
