//https://takeuforward.org/plus/dsa/problems/largest-element

package Arrays.Easy;

public class LargestElementOfArray {
    
    public static void main(String[] args) {
        
        int[] arr = {3,2,5,1,4};
        System.out.println(findLarElement(arr, 0));
        System.out.println(findLarEleRecursive(arr, arr.length-1, 0));
    }


    //brute force approach
    public static int findLarElement(int[] arr, int max){
        for(int ele : arr){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }

    //recursive approach
    public static int findLarEleRecursive(int[] arr, int n , int max){
        if(n<0){
            return max;
        }
        if(arr[n]> max){
            max = arr[n];
        }
        return findLarEleRecursive(arr, n-1, max);
    }
}
