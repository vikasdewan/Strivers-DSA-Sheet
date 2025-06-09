package BinarySearchQuestions;
import java.util.*;

public class FirstNLast {
    
    public static void main(String[] args) {
        
        int[] arr = {5,7,7,8,8,10};
        int[] ans = finalAns(arr, 6);
        System.out.println(Arrays.toString(ans));
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

    public static int[] finalAns(int[] arr , int target){
        int f = firstOcc(arr, target);
        int l = lastOcc(arr, target);
        int[] ans = {f,l};
        return ans;
    }
}
