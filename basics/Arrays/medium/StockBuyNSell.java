// https://takeuforward.org/plus/dsa/problems/best-time-to-buy-and-sell-stock
package Arrays.medium;

import java.util.*;

public class StockBuyNSell {

    public static void main(String[] args) {

        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int profit = profit(arr, arr.length);
        System.out.println(profit);

    }

    public static int profit(int[] arr, int n) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int L = 0;
        int R = n - 1;
        while (L <= R) {
            if (arr[L] < minVal) {
                minVal = arr[L];
            }
            if (arr[R] > maxVal) {
                maxVal = arr[R];
            }
            L++;
            R--;
        }
        return maxVal - minVal;
    }
}
