package Arrays.Easy;

public class MaxConsecutiveOnes {
    
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,1,1,1,1,1,1};
        System.out.println(findMaxOnes(arr,arr.length-1,0,0));
        System.out.println(findMaxOnesIterative(arr));
    }

    public static int findMaxOnes(int arr[],int n,int currCount, int count){
        if(n<0){
            return Math.max(currCount,count);
        }
        if(arr[n] == 1){
         return   findMaxOnes(arr, n-1, currCount+1, count);
        }else{
            count = Math.max(currCount,count);
          return  findMaxOnes(arr, n-1, 0, count);
        }
    }

    public static int findMaxOnesIterative(int arr[]){
        int count = 0;
        int currCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                currCount++;
            }else{
                count = Math.max(currCount,count);
                currCount = 0;
            }
        }
        return Math.max(currCount,count);
    }
}
