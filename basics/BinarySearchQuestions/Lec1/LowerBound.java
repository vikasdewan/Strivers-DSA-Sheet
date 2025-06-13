package Lec1;

public class LowerBound {

    public static void main(String[] args) {

        int[] arr = { 2, 7, 9, 10, 13 };
        int x = 15;
        System.out.println(lowerBoundForX(arr, x));
    }

    public static int lowerBoundForX(int[] arr, int x) {

        int lowerBound = arr.length;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] >= x) {
                lowerBound = m;
                e = m - 1;
            } else {
                s = m + 1;
            }

        }
        return lowerBound;
    }

}