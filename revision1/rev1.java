package revision1;
import java.util.*;

public class rev1 {
    

    public static void main(String[] args) {
        

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length-1)));
    }

    public static int[] reverseArray(int[] arr,int low , int high ){
        if(low == high){
            return arr;
        }
        swap(arr,low,high);
        return reverseArray(arr,low+1,high-1);
    }
    
    public static void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
