//https://takeuforward.org/plus/dsa/problems/single-number---i
package Arrays.Easy;

public class FindNumThatAppearOnes {
   
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(findNum(arr));
    }

    //solve using Hashing
    public static int findNum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int[] hash = new int[max+1];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        for(int i=0;i<hash.length;i++){
            if(hash[i] == 1){
                return i;
            }
        }
        return -1;
    }
}
