package Lec2;

import java.util.Arrays;

public class AggressiveCows{

    public static void main(String[] args) {
        
        int[] arr = {4,2,1,3,6};
        int k = 2;
        System.out.println(aggressiveCows(arr, k));
        System.out.println(aggressiveCowsOptimal(arr, k));
    }

     public static boolean canWePlace(int[] stalls, int dist, int cows) {
        int n = stalls.length; //size of array
        int cntCows = 1; //no. of cows placed
        int last = stalls[0]; //position of last placed cow.
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++; //place next cow.
                last = stalls[i]; //update the last location.
            }
            if (cntCows >= cows) return true;
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length; //size of array
        //sort the stalls[]:
        Arrays.sort(stalls);

        int limit = stalls[n - 1] - stalls[0];
        for (int i = 1; i <= limit; i++) {
            if (canWePlace(stalls, i, k) == false) {
                return (i - 1);
            }
        }
        return limit;
    }


    //optimal solution

    public static int aggressiveCowsOptimal(int[] stalls ,int k){
        int n = stalls.length;
        Arrays.sort(stalls);
        int limit = stalls[n-1] - stalls[0];
        int low = 1;
        int high = limit;
        while(low<= high){
            int mid = ( high + low )/ 2;
            if(canWePlace(stalls, mid, k) == true){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }

}