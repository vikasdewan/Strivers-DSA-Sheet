package BinarySearchQuestions;

public class SearchRotatedSortedArray {
    
    public static void main(String[] args) {
        
        int[] arr = {8,10,12,2,4,6};
        int target = 4;
        System.out.println(search(arr, target));
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
}
