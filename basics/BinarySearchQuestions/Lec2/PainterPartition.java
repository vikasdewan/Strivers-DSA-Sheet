package Lec2;

public class PainterPartition {

    public static void main(String[] args) {
        int[] arr = { 5, 10, 30, 20, 15 };
        int k = 3;
        System.out.println(minTime(arr, k));

    }

    public static int minTime(int[] arr, int k) {

        int maxElement = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSum += arr[i];
            if (maxElement < arr[i]) {
                maxElement = arr[i];
            }
        }
        int low = maxElement;
        int high = maxSum;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (countOfPainters(arr, mid) > k) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }

    public static int countOfPainters(int[] arr, int maxTimeForOneWorker) {
        int painterCount = 1;
        int totalTime = 0;
        for (int i = 0; i < arr.length; i++) {
            if (totalTime + arr[i] <= maxTimeForOneWorker) {
                totalTime += arr[i];
            } else {
                painterCount++;
                totalTime = arr[i];
            }
        }
        return painterCount;
    }
}