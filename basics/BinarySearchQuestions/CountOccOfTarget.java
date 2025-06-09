package BinarySearchQuestions;
import java.util.*;

public class CountOccOfTarget {
    
    public static void main(String[] args) {
         int[] arr = {2,4,6,6,6,8,9,10};
        int target = 6;
        System.out.println(count(arr, target));
    }

    public static int firstOcc(int[] arr, int target){
       
        int s = 0;
        int res = -1;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                res = mid;
                e = mid-1;
            }else if(target < arr[mid]){
                e= mid-1;
            }else{
                s = mid+1;
            }
        }
        return res;

    }
    public static int lastOcc(int[] arr, int target){
       
        int s = 0;
        int res = -1;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                res = mid;
                s = mid+1;
            }else if(target < arr[mid]){
                e= mid-1;
            }else{
                s = mid+1;
            }
        }
        return res;
    }

    public static int[] firstNLastPosition(int[] arr , int target){
        int f = firstOcc(arr, target);
        if (f==-1) return new int[]{-1,-1}; 
        int l = lastOcc(arr, target);
        int[] ans = {f,l};
        return ans;
    }

    public static int count(int[] arr, int taget){
        int[] ans = firstNLastPosition(arr, taget);
        if(ans[0] ==-1) return 0;
        return (ans[1] - ans[0] + 1);
    }
}
