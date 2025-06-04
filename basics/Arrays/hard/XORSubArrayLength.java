package Arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class XORSubArrayLength {
    
    public static void main(String[] args) {
        
        int[] arr = {4,2,2,6,4};
        System.out.println(length(arr, 6));
    }

    public static int length(int[] arr,int target){
        
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int xor = 0;
            for(int j = i ;j<arr.length;j++){
                xor = xor ^ arr[j];
                if(xor == target){
                    count++;
                }
            }
        }
        return count;
    }


    //optimal approach.
      public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ a[i];

            //By formula: x = xr^k:
            int x = xr ^ k;

            // add the occurrence of xr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }
}
