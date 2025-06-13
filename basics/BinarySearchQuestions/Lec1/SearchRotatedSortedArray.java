package Lec1;

public class SearchRotatedSortedArray {
    
    public static void main(String[] args) {
        
        int[] arr = {3,1,2,3,3,3,3};
        int target = 3;
        System.out.println(search(arr, target));
        System.out.println(searchInARotatedSortedArrayII(arr, target));
    }


    public static int search(int[] arr , int target){
        int pivot = findPivot(arr);
        int start = 0;
        int end = arr.length-1;
        int firstTry = binarySearch(arr,target , start , pivot);

        if(firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr,target , pivot + 1, end);
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid +1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }

    public static int binarySearch(int[] arr ,int target , int start , int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid =  start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid+1;
                }

            }else{
                if(target < arr[mid]){
                    start = mid +1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


        //optimal 2 //for duplicate entries.
        public static boolean searchInARotatedSortedArrayII(int []arr, int k) {
        int n = arr.length; // size of the array.
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            //if mid points the target
            if (arr[mid] == k) return true;

            //Edge case:
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    //element exists:
                    high = mid - 1;
                } else {
                    //element does not exist:
                    low = mid + 1;
                }
            } else { //if right part is sorted:
                if (arr[mid] <= k && k <= arr[high]) {
                    //element exists:
                    low = mid + 1;
                } else {
                    //element does not exist:
                    high = mid - 1;
                }
            }
        }
        return false;
    }


}
