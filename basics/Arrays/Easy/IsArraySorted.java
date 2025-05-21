package Arrays.Easy;

public class IsArraySorted {
    
    public static void main(String[] args) {
        
        int[] arr = {4,5,1,2,3};
        System.out.println(isSorted(arr));
        System.out.println(isSortedRec(arr, arr.length-1, 0));
    }

    public static boolean isSorted(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                count++;
            }
        }
        if(count > 1){
            return false;
        }
        return true;
    }

    public static boolean isSortedRec(int arr[], int n ,int count){
        if(n==0){
            if(count >1){
                return false;
            }
            return true;
        }

        if(arr[n] < arr[n-1]){
            return isSortedRec(arr, n-1, count+1);
        }
        return isSortedRec(arr, n-1, count);
    }
}
