package Lec1;

public class FindNoOfRotations {
    
    public static void main(String[] args) {
        
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(findRotation(arr));
    }

    public static int findRotation(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]> arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return (end+1)%arr.length;
    }
}
