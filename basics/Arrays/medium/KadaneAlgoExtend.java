package Arrays.medium;
import java.util.ArrayList;

//print that subarray which has maximum sum
public class KadaneAlgoExtend {
    
    public static void main(String[] args) {
        
        int[] arr = {-2,-3,-7,-2,-10,-4};
        maxSubArray(arr);
        masSubArrayBF(arr);
    }

    //brute force approach (BF - brute force)
    public static void masSubArrayBF(int[] nums){
        int maxi  = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ;i<nums.length;i++){
            int sum = 0;
            ArrayList<Integer> tempList = new ArrayList<>();
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                tempList.add(nums[j]);
                 if(sum > maxi){
                    maxi = sum;
                    list.clear(); // clear previous subarray
                    list.addAll(tempList); // add new subarray
                   
                }
            }
        }
        System.out.println("Maximum subarray sum: " + maxi);
        System.out.println("Subarray: " + list);
    }


//optimal
    public static void maxSubArray(int[] nums) {
        
        int maxi = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum > maxi) {
                maxi = sum;
                start = tempStart;
                end = i;
            }

            if(sum < 0) {
                sum = 0;
                tempStart = i + 1; // reset start index
            }
        }

        System.out.println("Maximum subarray sum: " + maxi);
        System.out.print("Subarray: ");
        for(int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
