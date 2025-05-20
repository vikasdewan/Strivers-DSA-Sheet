package sorting;

import java.util.Arrays;

public class mergeSort{

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        int[] sortedArr = sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }


    public static int[] sort(int[] arr){
        
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left , right); 
    }

    public static int[] merge(int[] left, int[] right){
        int leftArrPointer = 0;
        int rightArrPointer = 0;
        int[] merged = new int[left.length + right.length];
        
        int mergedArrIdx =0;
        while(leftArrPointer < left.length && rightArrPointer < right.length){
            if(left[leftArrPointer] < right[rightArrPointer]){
                merged[mergedArrIdx++] = left[leftArrPointer];
                leftArrPointer++;
            }else{
                merged[mergedArrIdx++] = right[rightArrPointer];
                rightArrPointer++;
            }
        }

        while(leftArrPointer < left.length){
            merged[mergedArrIdx++] = left[leftArrPointer];
            leftArrPointer++;
        }
        while(rightArrPointer < right.length){
            merged[mergedArrIdx++] = right[rightArrPointer];
            rightArrPointer++;
        }

        return merged;
    }
}