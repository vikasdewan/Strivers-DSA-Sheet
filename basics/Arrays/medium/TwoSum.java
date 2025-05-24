package Arrays.medium;
import java.util.HashMap;

public class TwoSum {
        
    public static void main(String[] args) {
        
        int[] nums = {1,6,2,10,3};
        int target = 7;
        int[] result = twoSum(nums, target);
        int[] result2 = twoSumHash(nums, target);
        System.out.println("Brute Force Approach:");
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Optimal Approach:");
        System.out.println("Indices: " + result2[0] + ", " + result2[1]);

    }

    //brute force approach
    public static int[] twoSum(int[] nums , int target){
        int[] result = {-1,-1};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    //optimal approach
    public static int[] twoSumHash(int[] nums,int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if(map.containsKey(moreNeeded)){
                 ans[0] = map.get(moreNeeded);
                 ans[1] = i;
                 return ans;
        }
        map.put(num,i);
    }
    return ans;
}

}
