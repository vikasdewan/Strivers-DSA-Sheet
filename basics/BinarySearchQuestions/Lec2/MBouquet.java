package Lec2;

public class MBouquet {
    
    public static void main(String[] args) {
        

        int[] arr = {7,7,7,7,13,11,12,7};
        int m = 2;
        int k = 3;
        System.out.println(roseGarden(arr, m, k));
    }

    public static int roseGarden(int[] arr , int m , int k){
        if(m*k> arr.length){
            return -1;
        }
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            maxi = Math.max(arr[i],maxi);
            mini = Math.min(arr[i],mini);
        }

        for(int i = mini ;i<=maxi ;i++){
            if(possible(arr,i,m,k)){
                return i;
            }
        }
        return -1;
    }

    public static boolean possible(int[] arr ,int days ,int m ,int k){
        int n = arr.length;
        int count = 0;
        int noOfB = 0;

        for(int i = 0 ;i< n ;i++){
            if(arr[i]<=days){
                count++;
            }else{
                noOfB += (count/k);
                count = 0;
            }
        }
        noOfB += (count/k);
        return noOfB >= m;
    }


    //optimal 

    public static int roseGardenOptimal(int[] arr , int m , int k){
        if(m*k >(long) arr.length){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            low = Math.min(arr[i],low);
            high = Math.max(arr[i],high);
        }

        while(low<=high){
            int mid = (low + high)/2;
            if(possible(arr,mid , m ,k)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
