package basics;

public class checkStringPalindrome {
    
    public static void main(String[] args) {
        String str = "masdam";
        boolean isPalindrome = isPalindrome(str,0,str.length()-1);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str , int Start , int End){
        if(Start >= End){
            return true;
        }
        if(str.charAt(Start) != str.charAt(End)){
            return false;
        }
        else{
            return isPalindrome(str , (Start+1) , (End-1));
        }
    }
}
