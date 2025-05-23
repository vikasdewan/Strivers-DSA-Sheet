package Arrays.Easy;

public class longestSubArrayofSumK {
    

    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 2;
        System.out.println(longestSubArray(arr, k));
        System.out.println(longestSubArrayOptimal(arr, k));
        System.out.println(getLongestSubarray(arr, k));

    }

    //brute force approach
    public static int longestSubArray(int[] arr, int k){
        int maxCount = 0;
        
        for(int i=0;i<arr.length;i++){
            int currCount = 0;
            int sum = 0;
            for(int j= i;j<arr.length;j++){
                sum+= arr[j];
                if(sum == k){
                    currCount++;
                }
                else if(sum < k){
                    currCount++;
                } 
            }
            maxCount = Math.max(currCount, maxCount);
        }
        if(maxCount == 0){
            return 0;
        }
        return maxCount;    
    }

        //optimal approach
        public static int longestSubArrayOptimal(int[] arr, int k){
            int len =0;
            for(int i=0;i<arr.length;i++){
                int sum = 0;
                for(int j=i;j<arr.length;j++){
                    sum += arr[j];
                    if(sum == k){
                        len = Math.max(len, j-i+1);
                    }
                }
            }
            return len;
        }

        //more optimal approach
         public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
}
