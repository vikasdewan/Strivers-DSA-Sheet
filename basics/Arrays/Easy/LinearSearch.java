//https://takeuforward.org/plus/dsa/problems/linear-search
package Arrays.Easy;

public class LinearSearch {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        System.out.println(linearSearch(arr, 3));
        System.out.println(linearSearchRec(arr, 3, 0));
    }

    public static int linearSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchRec(int arr[], int target, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return linearSearchRec(arr, target, i+1);
    }
}
