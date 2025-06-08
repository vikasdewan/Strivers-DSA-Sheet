package BinarySearchQuestions;
import java.util.*;

public class SearchInsPos {
    
    public static void main(String[] args) {
        
        int[] arr = {2,4,6,8,10,14,17,19};
        int target = 9;
        System.out.println(targetPos(arr,target));
    }

    public static int targetPos(int[] arr ,int target){
        int instPos = 0;
        int s= 0;
        int e = arr.length-1;
        while(s<=e){
            int m = (s + e) /2;
            if(arr[m]>=target){
                instPos = m;
                e = m-1;
            }else{
                s = m+1;
            }
            
        }
         
        return instPos;
    }
}
