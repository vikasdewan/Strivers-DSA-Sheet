package Arrays.hard;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        
        int[] arr = {7,-7,1,2,14,3};
        int target = 9;
        List<List<Integer>> ans = FourSumOfTarget(arr,target);
        System.out.println(ans);
    }

   public static List<List<Integer>> FourSumOfTarget(int[] arr,int target){
        
        List<List<Integer>> list = new ArrayList<>();

         for(int i = 0;i<arr.length-3;i++){
             ArrayList<Integer> row = new ArrayList<>();
            for(int j = i+1;j<arr.length-2;j++){
                if((arr[i] + arr[j] + arr[j+1] + arr[j+2]) == target ){
                    if((i!=(j)) &&  (i!=(j+1)) && ((j)!=(j+1))  && (i!=(j+2)) && ((j+1) != (j+2)) && (j !=(j+2))){
                        row.add(arr[i]);
                        row.add(arr[j]);
                        row.add(arr[j+1]);
                        row.add(arr[j+2]);
                        list.add(row);
                    }
                }
            }
         }
         
         return list;
    }


    //optimal approach:
    
     public static List<List<Integer>> fourSumOpt(int[] nums, int target) {
        int n = nums.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();

        // sort the given array:
        Arrays.sort(nums);

        // calculating the quadruplets:
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i:
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j:
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 2 pointers:
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }

        return ans;
    }
}
