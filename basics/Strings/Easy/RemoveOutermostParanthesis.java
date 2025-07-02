package Strings.Easy;
import java.util.*;

public class RemoveOutermostParanthesis {
    
    public static void main(String[] args) {
       System.out.println(removeOuterParan("(()())(())"));
    }

    public static String removeOuterParan(String str){
       int count = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ')'){
                count--;
            }
            if(count != 0 ){
                sb.append(str.charAt(i));
            }
            if(str.charAt(i) == '('){
                count++;
            }
        }
        return sb.toString();
    }
}
