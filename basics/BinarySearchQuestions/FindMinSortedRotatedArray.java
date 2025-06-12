package BinarySearchQuestions;

public class FindMinSortedRotatedArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        System.out.println(findMin(arr));
    }


    public static int findMin(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return arr[(end+1)%arr.length];
    }
}
