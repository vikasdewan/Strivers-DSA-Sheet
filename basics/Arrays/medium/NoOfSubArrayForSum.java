//https://takeuforward.org/plus/dsa/problems/count-subarrays-with-given-sum

package Arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class NoOfSubArrayForSum {
    

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(count(arr,k));
        System.out.println(findAllSubarraysWithGivenSum(arr,k));

    }

    //brute force , infact it is a better solution not a brute force
    public static int count(int[] arr, int k){
    
        int count = 0;
        int sum;
        for(int i = 0;i<arr.length;i++){
                sum = 0;
            for(int j = i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k ){
                    count++;
                }
            }
        }
        return count;

    }

    //optimal solution
   public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Count for subarrays starting at index 0

        for (int i = 0; i < n; i++) {
            preSum += arr[i];

            int remove = preSum - k;

            cnt += mpp.getOrDefault(remove, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }

     
}
