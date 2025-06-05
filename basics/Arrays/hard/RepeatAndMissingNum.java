package Arrays.hard;

import java.util.*;

public class RepeatAndMissingNum {

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 4, 5 };
        ArrayList<Integer> result = finder(arr);
        int[] betterRes = findMissingRepeatingNumbers(arr);
        System.out.println(result);
        System.out.println(Arrays.toString(betterRes));
    }

    // brute force
    public static ArrayList<Integer> finder(int[] arr) {
        int n = arr.length;
        int[] sortArr = sort(arr, n);
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>(n + 1);
        for (int i = 0; i < n; i++) {
            map.put(sortArr[i], map.getOrDefault(sortArr[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(sortArr[i]) == 2 && !ans.contains(sortArr[i])) {
                ans.add(sortArr[i]);
            }
            if (map.get(i) == null && i != 0) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static int[] sort(int[] arr, int n) {
        if (n == 0) {
            return arr;
        }
        int maxEleIdx = 0;
        int maxIdx = n - 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[maxEleIdx]) {
                maxEleIdx = i;
            }
        }
        swap(arr, maxEleIdx, maxIdx);
        return sort(arr, n - 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // better approach

    public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length; // size of the array
        int[] hash = new int[n + 1]; // hash array

        // update the hash array:
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        // Find the repeating and missing number:
        int repeating = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2)
                repeating = i;
            else if (hash[i] == 0)
                missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = { repeating, missing };
        return ans;
    }

}
