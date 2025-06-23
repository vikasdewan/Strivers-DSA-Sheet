package Lec2;

import java.util.ArrayList;

public class KthElementOfTwoSortedArray {
    

    public static void main(String[] args) {
        
        int[] arr1 = {2,3,6,7,9};
        int[] arr2 = {1,4,8,10};
        System.out.println(kthElement(arr1, arr2, 5));
        System.out.println(kthElementBetter(arr1, arr2, arr1.length,arr2.length,5));
    }


    public static int kthElement(int[] arr1,int[] arr2,int k){
        
         int[] mergedArr = merge(arr1,arr2);

           if (k <= 0 || k > mergedArr.length) return -1;
    return mergedArr[k - 1];
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


    public static int kthElementBetter(int[] a, int[] b, int m, int n, int k) {
        int ele = -1;
        int cnt = 0; //counter
        // apply the merge step:
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] < b[j]) {
                if (cnt == k - 1) ele = a[i];
                cnt++;
                i++;
            } else {
                if (cnt == k - 1) ele = b[j];
                cnt++;
                j++;
            }
        }

        // copy the left-out elements:
        while (i < m) {
            if (cnt == k - 1) ele = a[i];
            cnt++;
            i++;
        }
        while (j < n) {
            if (cnt == k - 1) ele = b[j];
            cnt++;
            j++;
        }

        return ele;
    }

}
