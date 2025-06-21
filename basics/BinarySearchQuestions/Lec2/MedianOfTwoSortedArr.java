package Lec2;
import java.util.Arrays;
public class MedianOfTwoSortedArr {
    
    public static void main(String[] args) {
        
        int[] arr1 = {2,4,6};
        int[] arr2 = {1,3,5};
        System.out.println(median(arr1, arr2)); // Output: 2.0
    }

    public static double median(int[] arr1, int[] arr2){

        int[] mergedArr = merge(arr1,arr2);
        
	      
	if(mergedArr.length % 2 == 0){
       
		return (double) (mergedArr[(mergedArr.length-1)/2] + mergedArr[((mergedArr.length -1)/2) + 1])/2;
     }  else{
        System.out.println("else");
  		return (mergedArr[(mergedArr.length-1)/2]); 
	}
	
    }

     public static int[] merge(int[] left, int[] right){
        int leftArrPointer = 0;
        int rightArrPointer = 0;
        int[] merged = new int[left.length + right.length];
        
        int mergedArrIdx =0;
        while(leftArrPointer < left.length && rightArrPointer < right.length){
            if(left[leftArrPointer] < right[rightArrPointer]){
                merged[mergedArrIdx++] = left[leftArrPointer++];
            }else{
                merged[mergedArrIdx++] = right[rightArrPointer++];
            }
        }

        while(leftArrPointer < left.length){
            merged[mergedArrIdx++] = left[leftArrPointer++];
        }
        while(rightArrPointer < right.length){
            merged[mergedArrIdx++] = right[rightArrPointer++];
        }

        return merged;
    }

}