package Arrays.medium;

import java.util.Arrays;

public class LongestSeqLength {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int result = Length(arr);
        System.out.println("Longest Consecutive Sequence Length: " + result);
    }

    public static int Length(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int[] newArr = sorting(arr);
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] == newArr[i - 1]) {
                continue; // skip duplicates
            }
            if (newArr[i] == newArr[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static int[] sorting(int[] arr) {
        // Insertion sort (as per your logic)
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp; // Fix here
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
