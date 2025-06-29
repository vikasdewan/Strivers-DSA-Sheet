package Lec3;

import java.util.*;

public class findPeakElement {

    public static void main(String[] args) {

        int[][] arr = { { 1, 4 }, { 3, 2 } };
        int[] ans = peakEle(arr);
        int[] ansOpt = peakEleOptimal(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ansOpt));
    }

    public static int[] peakEle(int[][] arr) {

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                if (r == 0 && c == 0) {
                    if (arr[r][c] > arr[r + 1][c] && arr[r][c] > arr[r][c + 1]) {
                        return new int[] { r, c };
                    }
                } else if (r == 0 && c == arr[0].length - 1) {
                    if (arr[r][c] > arr[r][c - 1] && arr[r][c] > arr[r + 1][c]) {
                        return new int[] { r, c };
                    }
                } else if (r == arr.length - 1 && c == 0) {
                    if (arr[r][c] > arr[r - 1][c] && arr[r][c] > arr[r][c + 1]) {
                        return new int[] { r, c };
                    }
                } else if (r == arr.length - 1 && c == arr[0].length) {
                    if (arr[r][c] > arr[r - 1][c] && arr[r][c] > arr[r][c - 1]) {
                        return new int[] { r, c };
                    }
                } else {
                    if (arr[r][c] > arr[r][c + 1] && arr[r][c] > arr[r][c - 1] && arr[r][c] > arr[r - 1][c]
                            && arr[r][c] > arr[r + 1][c]) {
                        return new int[] { r, c };
                    }
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] peakEleOptimal(int[][] arr) {
        int low = 0;
        int high = arr[0].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int maxEleRow = findMax(arr, mid);

            int left = (mid - 1 >= 0) ? arr[maxEleRow][mid - 1] : Integer.MIN_VALUE;
            int right = (mid + 1 < arr[0].length) ? arr[maxEleRow][mid + 1] : Integer.MIN_VALUE;

            if (arr[maxEleRow][mid] >= left && arr[maxEleRow][mid] >= right) {
                return new int[] { maxEleRow, mid };
            } else if (arr[maxEleRow][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 }; // No peak found (shouldn't happen in a valid input)
    }

    public static int findMax(int[][] arr, int col) {
        int maxVal = Integer.MIN_VALUE;
        int idx = -1;
        for (int r = 0; r < arr.length; r++) {
            if (arr[r][col] >= maxVal) {
                maxVal = arr[r][col];
                idx = r;
            }
        }
        return idx;
    }
}
