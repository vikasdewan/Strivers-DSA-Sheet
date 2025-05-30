// https://takeuforward.org/plus/dsa/problems/sort-an-array-of-0's-1's-and-2's
package Arrays.medium;
import java.util.*;

public class Sort012 {
    
    public static void main(String[] args) {
        
        int[] arr = {0,2,0,1,2};
        // sortArray012(arr);
        sortArray012Opt(arr);

    }

    //brute force approach
    // public static void sortArray012(int[] nums){

    //     ArrayList<Integer> list = new ArrayList<>(nums.length);
    //     for(int i = 0 ;i<3;i++){
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[j] == i){
    //                 list.add(i);
    //             }
    //         }
    //     }
    //     System.out.println(list);
    // }


    // optimal approach

    public static void sortArray012Opt(int[] arr){
         int low = 0, mid = 0, high = arr.length - 1;
         while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
         }
            System.out.println(Arrays.toString(arr));   

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
