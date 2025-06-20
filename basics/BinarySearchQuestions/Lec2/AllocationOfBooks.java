package Lec2;

public class AllocationOfBooks {

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        System.out.println(MaxPages(arr, 2)); // Expected output: 113
    }

    public static int MaxPages(int[] arr, int m) {
        int maxOfArr = Integer.MIN_VALUE;
        int sumOfArr = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfArr += arr[i];
            if (arr[i] > maxOfArr) {
                maxOfArr = arr[i];
            }
        }

        int low = maxOfArr;
        int high = sumOfArr;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (countOfStudent(arr, mid) > m) {
                low = mid + 1;
            } else {
                result = mid; // Potential answer
                high = mid - 1;
            }
        }
        return result;
    }

    public static int countOfStudent(int[] arr, int maxPagesAllowed) {
        int pages = 0;
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPagesAllowed) {
                return Integer.MAX_VALUE; // Not possible to allocate
            }

            if (pages + arr[i] <= maxPagesAllowed) {
                pages += arr[i];
            } else {
                count++;
                pages = arr[i];
            }
        }
        return count;
    }
}
