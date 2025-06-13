package Lec1;

public class FindXSortedArray {

    public static void main(String[] args) {

        int[] arr = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(indexOfTarget(arr, target));
        System.out.println(findIdxRecursive(arr, 0, arr.length - 1, target));
    }

    public static int indexOfTarget(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == target) {
                return m;
            } else if (target < arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        return -1;
    }

    // recursive approach
    public static int findIdxRecursive(int[] arr, int s, int e, int target) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        } else if (target < arr[m]) {
            return findIdxRecursive(arr, s, m - 1, target);
        } else {
            return findIdxRecursive(arr, m + 1, e, target);
        }
    }
}
