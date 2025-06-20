package Lec2;

public class SplitArrayLargestSum {
    
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        System.out.println(largestSum(arr, 2));
    }


    public static int largestSum(int[] arr, int k){
        int maxEle = Integer.MIN_VALUE;
        int maxSum = 0;

        for(int i = 0;i<arr.length;i++){
            maxSum += arr[i];
            if(arr[i]> maxEle){
                maxEle = arr[i];
            }
        }
        int low = maxEle;
        int high = maxSum;
       
        while(low<=high){
            int mid = (low+high)/2;
            if(countOfSubArray(arr,mid)>k){
                low = mid + 1;
            }else{
                
                high = mid-1;
            }
        }
        return low;
    }

    public static int countOfSubArray(int[] arr, int maxAllowedSum){
        int count = 1;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(sum + arr[i] <= maxAllowedSum){
                sum += arr[i];
            }else{
                count++;
                sum = arr[i];
            }
        }
        return count;
    }
}
