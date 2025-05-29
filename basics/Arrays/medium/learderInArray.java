package Arrays.medium;
import java.util.*;

  
public class learderInArray {
    
    public static void main(String[] args) {
        
        int[] arr = {-3,4,5,1,-4,-5};
         ArrayList<Integer> ans = leaders(arr);
         System.out.println(ans);
    }


    public static ArrayList<Integer> leaders(int[] nums){
        boolean Flag;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ;i<nums.length-1;i++){
            Flag = true;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] < nums[j]){
                    Flag = false;
                }
            }
            if(Flag == true){
                list.add(nums[i]);
            }
        }
        list.add(nums[nums.length-1]);
        return list;    
    }
}
