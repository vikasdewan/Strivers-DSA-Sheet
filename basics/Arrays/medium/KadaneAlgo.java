// https://takeuforward.org/plus/dsa/problems/kadane's-algorithm

package Arrays.medium;

import java.util.*;

public class KadaneAlgo {

    public static void main(String[] args) {

        int[] arr = {2,3,5,-2,7,-4 };
        int ans = maxSubArray(arr);
        int ansOpt = maSubArrayOpt(arr);
        System.out.println("Brute Force Approach:");
        System.out.println(ans);
        System.out.println("Optimal Approach:");
        System.out.println(ansOpt);
    }

    public static int maxSubArray(int[] nums) {
        
        int maxi = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length ;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
     }

     //optimal approach
     public static int maSubArrayOpt(int[] nums){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0 ;i< nums.length;i++){
            sum += nums[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0 ){
                sum = 0; // reset sum if it becomes negative
            }
        }
        return maxi;
     }

    }
