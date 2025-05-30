// https://takeuforward.org/plus/dsa/problems/rearrange-array-elements-by-sign
package Arrays.medium;
import java.util.*;

  
public class learderInArray {
    
    public static void main(String[] args) {
        
        int[] arr = {-3,4,5,1,-4,-5};
         ArrayList<Integer> ans = leaders(arr);
         System.out.println(ans);
         ArrayList<Integer> ans2 = leadersBetter(arr);
         System.out.println(ans2);
         

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


    //better approach
    public static ArrayList<Integer> leadersBetter(int[] arr){
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = arr.length-1;i>=0;i--){
           
           if(max<arr[i]){
                max=arr[i];
                list.add(arr[i]);
            }
        }
        
        return reverse(list);

         
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
         
        ArrayList<Integer> newList = new ArrayList<>();

        for(int i = list.size()-1; i>=0;i--){
            newList.add(list.get(i));
        }
        return newList;
    }
}
