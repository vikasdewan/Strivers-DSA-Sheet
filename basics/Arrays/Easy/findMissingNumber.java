package Arrays.Easy;

public class findMissingNumber{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,5};
        int n = 5;
        System.out.println(find(arr, n));
    }

    public static int find(int arr[], int n){

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int total = (n*(n+1))/2;
        return total - sum;
    }
}