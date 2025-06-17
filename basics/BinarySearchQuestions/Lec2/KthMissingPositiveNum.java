package Lec2;

import java.util.Scanner;
public class KthMissingPositiveNum {
    

    public static void main(String[] args) {
        
        int[] arr = {2,3,4,7,11};
        int k = 5;
        // System.out.println(findKthPositive(arr, k));
        System.out.println(findKthPositiveOptimal(arr, k));
    }

    public static int findKthPositive(int[] arr, int k){
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] <= k){
               k++;
            }
        }
        return k;
    }

    public static int findKthPositiveOptimal(int[] arr, int k){
    int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = arr[mid] - (mid + 1);
             
            if (missing < k) {
                low = mid + 1;
               
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
        
    }
}
