package Lec2;

public class CapacityOfShipPackagesInDDays {
    
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(calculateCapacity(arr, days));
    }

    public static int calculateCapacity(int[] weights ,int d){

       int maxWeight = 0;
       int totalSum =0;
       for(int i = 0;i<weights.length;i++){
          totalSum += weights[i];
        if(maxWeight<weights[i]){
            maxWeight = weights[i];
          }
       }
       int low = maxWeight;
       int high = totalSum;
       while(low<=high){
           int mid = (low+high)/2;
           int days = 1;
           int load = 0;
           for(int i = 0 ;i<weights.length;i++){
            if(load+weights[i]<=mid){
                load+=weights[i];
                
            }else{
                days++;
                 load = weights[i];
            }
           }
           if(days<=d){
            high = mid-1;
           }else{
            low = mid+1;
           }
       }
       return low;
    }
}
