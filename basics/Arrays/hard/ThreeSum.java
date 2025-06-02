package Arrays.hard;
import java.util.*;

public class ThreeSum {
    
    public static void main(String[] args) {
        
        int[] arr = {2,-2,0,3,-3,5};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    public static List<List<Integer>> threeSum(int[] arr){
        
        List<List<Integer>> list = new ArrayList<>();

         for(int i = 0;i<arr.length-2;i++){
             ArrayList<Integer> row = new ArrayList<>();
            for(int j = i+1;j<arr.length-1;j++){
                if((arr[i] + arr[j] + arr[j+1]) == 0 ){
                    if((i!=(j)) &&  (i!=(j+1)) && ((j)!=(j+1))){
                        row.add(arr[i]);
                        row.add(arr[j]);
                        row.add(arr[j+1]);
                        list.add(row);
                    }
                }
            }
         }
         return list;
    }
}
