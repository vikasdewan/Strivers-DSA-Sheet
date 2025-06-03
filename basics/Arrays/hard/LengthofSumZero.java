package Arrays.hard;
import java.util.*;

public class LengthofSumZero{

    public static void main(String[] args) {
        
        int[] arr = {2,-1,3,-1,-2};
        int ans = length(arr);
        System.out.println(ans);
        int ans2 = maxLen(arr,arr.length);
        System.out.println(ans2);

    }

    public static int length(int[] arr){
        int maxCount = 0;

        for(int i = 0 ;i<arr.length;i++){
            int sum = 0;
         
            for(int j = i ;j<arr.length;j++){
                sum += arr[j];
                if(sum == 0){
                    maxCount = Math.max(maxCount, j-i+1);
                }
            }
        }
        return maxCount;
    }

    //optimal approach
  public static  int maxLen(int A[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += A[i]; 

            if(sum == 0) {
                maxi = i + 1; 
            }
            else {
                if(mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {

                    mpp.put(sum, i); 
                }
            }
        }
        return maxi; 
    }
}