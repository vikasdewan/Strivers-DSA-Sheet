package BinarySearchQuestions;

import java.util.*;

public class FindPeakElement {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
        System.out.println(findPeak(arr));
        
        ArrayList<Integer> arr1 =
            new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = findPeakElement(arr1);
        System.out.println("The peak is at index: " + ans);
    }

    
    //optimal approach better approach
     public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size(); // Size of array

        // Edge cases:
        if (n == 1) return 0;
        if (arr.get(0) > arr.get(1)) return 0;
        if (arr.get(n - 1) > arr.get(n - 2)) return n - 1;

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] is the peak:
            if (arr.get(mid - 1) < arr.get(mid) && arr.get(mid) > arr.get(mid + 1))
                return mid;

            // If we are in the left:
            if (arr.get(mid) > arr.get(mid - 1)) low = mid + 1;

            // If we are in the right:
            // Or, arr[mid] is a common point:
            else high = mid - 1;
        }
        // Dummy return statement
        return -1;
    }


    public static int findPeak(int[] arr) {
        int[] sortedArr = sort(arr, arr.length);
        int n = sortedArr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

    public static int[] sort(int[] arr, int n) {
        if (n == 0) {
            return arr;
        }
        int maxEleIdx = max(arr, n);
        int maxIdx = n - 1;
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[maxEleIdx];
        arr[maxEleIdx] = temp;
        return sort(arr, n - 1);
    }

    public static int max(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }


    

}
