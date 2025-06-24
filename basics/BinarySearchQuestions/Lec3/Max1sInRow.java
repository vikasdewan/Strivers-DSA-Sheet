package Lec3;

import java.util.*;

public class Max1sInRow {

    public static void main(String[] args) {

        int[][] mat = { { 0, 0, 0 }, { 1, 1, 1 } };
        System.out.println(maxOnesRowIdx(mat));
    }

    public static int maxOnesRowIdx(int[][] arr) {

        int[] arrAns = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            arrAns[i] = count;

        }
        int maxIdx = -1;
        for (int i = 0; i < arrAns.length - 1; i++) {
            if (arrAns[i] > arrAns[i + 1]) {
                maxIdx = i;
            } else {
                maxIdx = i + 1;
            }
        }
        return maxIdx;
    }


        //optimal solution
        public static int lowerBound(ArrayList<Integer> arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr.get(mid) >= x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
    public static int rowWithMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        int cnt_max = 0;
        int index = -1;

        // traverse the rows:
        for (int i = 0; i < n; i++) {
            // get the number of 1's:
            int cnt_ones = m - lowerBound(matrix.get(i), m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }
}
