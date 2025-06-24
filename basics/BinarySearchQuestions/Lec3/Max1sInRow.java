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

}
