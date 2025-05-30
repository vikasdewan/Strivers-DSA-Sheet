//https://takeuforward.org/plus/dsa/problems/second-largest-element
package Arrays.Easy;

public class SecondLarEleOfArray {
    
    public static void main(String[] args) {
        
        int[] arr = {3,2,5,1,4};
        System.out.println(findSecondLarEle(arr));
        System.out.println(findSecondLarEleRecursive(arr, arr.length-1, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    //brute
    public static int findSecondLarEle(int[] arr){
         int large = Integer.MIN_VALUE;
         int secondLarge = Integer.MIN_VALUE;
         for(int ele : arr){
            if(ele > large){
                secondLarge = large;
                large = ele;
            }else{
                if(ele> secondLarge && ele != large){
                    secondLarge = ele;
                }
            }
         }

         return secondLarge;
    }

    //recursive 
    public static int findSecondLarEleRecursive(int[] arr, int n , int large, int secondLarge){
        if(n<0){
            return secondLarge;
        }
        if(arr[n]> large){
          return  findSecondLarEleRecursive(arr, n-1, arr[n], large);
        }else{
            if(arr[n]> secondLarge && arr[n] != large){
             return findSecondLarEleRecursive(arr, n-1, large, arr[n]);
            }
        }
        return findSecondLarEleRecursive(arr, n-1, large, secondLarge);
    }

}
