package Arrays.medium;

import java.util.*;

public class MajorityElement {

    public static void main(String[] args){

        int[] nums = {3,2,3};
        //Brute force approach
       System.out.println(majorityEle(nums));
        //Optimal approach
       int ans =   majorityEleOpt(nums);
       System.out.println(ans);
    }

    //Brute force approach
    public static int majorityEle(int[] nums){
        
        int biggestEle = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
                if(nums[i] > biggestEle){
                    biggestEle = nums[i];
                }
        }

        HashMap<Integer, Integer> map = new HashMap<>(biggestEle + 1);
         for(int i = 0;i<=biggestEle;i++){
            map.put(i, 0);
         }
         for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
         }
         int maxCount = Integer.MIN_VALUE;
        int maxEle = -1;

            for(int i = 0;i<nums.length;i++){
                if(map.get(nums[i]) > maxCount){
                    maxCount = map.get(nums[i]);
                    maxEle = nums[i];
                }
            }

            if(maxCount > nums.length / 2){
                return maxEle;
        }
        return -1; // No majority element found
}

    //Optimal approach
    public static int majorityEleOpt(int[] nums){

        int biggestEle = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
                if(nums[i] > biggestEle){
                    biggestEle = nums[i];
                }
        }

        HashMap<Integer, Integer> map = new HashMap<>(biggestEle + 1);
        for(int i = 0;i<nums.length;i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }
  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() > nums.length / 2) {
            return entry.getKey();  // ✅ Return the element, not the count
        }
    }
        
        return -1; // No majority element found

    }


    // Optimal approach using Boyer-Moore Voting Algorithm
       public static int majorityElement(int []v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

}