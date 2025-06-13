package Lec1;
import java.util.*;

public class FloorNCeil {
    
    public static void main(String[] args) {
        
        int[] arr = {3,4,6,7,8,9,10};
        int[] ans = floorNCeilOfTarget(arr, 9);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] floorNCeilOfTarget(int[] arr, int target){
        int[] ans = new int[2];
        int s = 0 ;
        int e= arr.length-1;
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m] == target){
                ans[0] = arr[m];
                ans[1] = arr[m];
                break;
            }else if(target > arr[m]){
                ans[0] = arr[m];
                s = m+1;
            }else{
                ans[1] = arr[m];
                e = m-1;
            }
        }
        return ans;
    }
}
