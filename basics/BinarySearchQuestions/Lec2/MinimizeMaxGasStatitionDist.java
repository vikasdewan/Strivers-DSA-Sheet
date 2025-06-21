package Lec2;

public class MinimizeMaxGasStatitionDist {

    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 19, 33, 44, 67, 72, 89, 95};
        int k = 2;
        System.out.printf("%.6f\n", minTime(arr, k));
    }

    public static double minTime(int[] arr, int k) {
        int maxDiff = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > maxDiff) {
                maxDiff = arr[i + 1] - arr[i];
            }
        }
        double low = 0.0;
        double high = (double) maxDiff;

        while (high - low > 1e-6) {
            double mid = (low + high) / 2.0;
            int requiredStations = countOfGasStation(arr, mid);

            if (requiredStations > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static int countOfGasStation(int[] arr, double maxDist) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            double gap = arr[i + 1] - arr[i];
            count += (int) (gap / maxDist);
        }
        return count;
    }
}
