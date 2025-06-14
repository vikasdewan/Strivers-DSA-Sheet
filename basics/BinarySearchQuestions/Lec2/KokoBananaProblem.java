package Lec2;
import java.util.*;

public class KokoBananaProblem{

    public static void main(String[] args) {
        
        int[] arr = {25,12,8,14,19};
        int k = 5;
        System.out.println(findMinRateOpt(arr,k));
    }


    //brute force
    public static int findMinRate(int[] arr,int TotalHr){
        int maxi = findMax(arr);
        for(int i = 1;i<maxi;i++){
            int reqTime = calculateHourly(arr,i);
            if(reqTime<=TotalHr){
                return i;
            }
        }
        return maxi;
    }

    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }

    public static int calculateHourly(int[] arr, int hourly){
        int TotalH = 0;
        for(int i = 0 ;i<arr.length;i++ ){
            TotalH += Math.ceil((double)arr[i] / (double)hourly);
        }
        return TotalH;
    }


    //optimal 
    public static int findMinRateOpt(int[] arr ,int h){
        int maxi = findMax(arr);
        int low = 1;
        int high = maxi;
        while(low<=high){
            int mid = (low+high)/2;
            int totalH = calculateHourly(arr, mid);
            if(totalH <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}