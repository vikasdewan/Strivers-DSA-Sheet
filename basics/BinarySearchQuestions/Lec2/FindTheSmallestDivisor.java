package Lec2;

public class FindTheSmallestDivisor {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int T = 8;
        System.out.println(smallestDivisor(arr, T));
    }

    public static int smallestDivisor(int[] arr , int T){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        int low = 1;
        int high = maxi;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isDivisible(arr,mid,T)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }


    public static boolean isDivisible(int[] arr,int divisor,int T){
        int totalSum = 0;
        for(int i = 0;i<arr.length;i++){
            totalSum  = totalSum + Math.ceilDiv(arr[i] , divisor);
        }
        if(totalSum<=T){
            return true;
        }
        return false;
    }
}
