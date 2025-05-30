//https://takeuforward.org/plus/dsa/problems/left-rotate-array-by-one
package Arrays.Easy;

public class leftShiftArray {
 
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        leftShift(arr, n);
        System.out.println();
     
    }

    public static void leftShift(int arr[], int n){
        
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        
        display(arr);
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
